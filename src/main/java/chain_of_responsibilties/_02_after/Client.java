package chain_of_responsibilties._02_after;

import chain_of_responsibilties._01_before.Request;

public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("이번 놀이는 뽑기 입니다.");
        requestHandler.handle(request);
    }

    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client(chain);
        client.doWork();
    }
}

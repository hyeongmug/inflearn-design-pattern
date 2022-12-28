package chain_of_responsibilties._01_before;

public class RequestHandler {

    public void handler(Request request) {
        System.out.println(request.getBody());
    }
}

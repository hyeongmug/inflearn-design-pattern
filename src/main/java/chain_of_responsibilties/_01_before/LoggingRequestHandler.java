package chain_of_responsibilties._01_before;

public class LoggingRequestHandler extends RequestHandler {
    @Override
    public void handler(Request request) {
        System.out.println("로깅");
        super.handler(request);
    }
}

package decorator._01_before;

public class Client  {
    private CommonService commonService;

    public Client(CommonService commonService) {
        this.commonService = commonService;
    }

    private void writeComment(String comment) {
        commonService.writeComment(comment);
    }

    public static void main(String[] args) {
        Client client = new Client(new SpamFilteringCommentService());
        client.writeComment("오징어 게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("무슨 말이야...");
    }
}

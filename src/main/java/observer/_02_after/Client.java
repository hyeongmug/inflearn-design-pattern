package observer._02_after;

public class Client {

    public static void main(String[] args) {

        ChatServer chatServer = new ChatServer();
        User user1 = new User("lim");
        User user2 = new User("park");

        // 구독 등록
        chatServer.register("오징어게임", user1);
        chatServer.register("오징어게임", user2);

        chatServer.register("디자인패턴", user1);

        chatServer.sendMessage(user1, "오징어게임", "아.. 이름이 기억났어.. 일남이야.. 오일남");
        chatServer.sendMessage(user2, "디자인패턴", "옵저버 패턴으로 만든 채팅");

        // 구독 해지
        chatServer.unregister("디자인패턴", user2);

        chatServer.sendMessage(user2, "디자인패턴", "옵저버 패턴 장,단점은 뭐가 있을까요?");


    }

}

package factory_method._01_before;

public class Client {

    public static void main(String[] args) {

        Ship witeship = ShipFactory.orderShip("whiteship", "test1@mail.com");
        System.out.println(witeship);

        Ship blackship = ShipFactory.orderShip("blackship", "test2@mail.com");
        System.out.println(blackship);
    }
}

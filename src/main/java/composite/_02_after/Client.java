package composite._02_after;

public class Client {

    public static void main(String[] args) {
        Item doranBlade = new Item("도란걸", 450);
        Item healthPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healthPotion);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(healthPotion);
        client.printPrice(bag);
    }

    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}

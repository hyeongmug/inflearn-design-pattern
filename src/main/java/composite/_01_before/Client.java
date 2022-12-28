package composite._01_before;

import java.util.List;

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
    }

    private void printPrice(Item item) {
        System.out.println(item.getName() + "의 가격은 " + item.getPrice() + "입니다.");
    }

    private void printPrice(Bag bag) {
        int sum = bag.getItems().stream().mapToInt(Item::getPrice).sum();
        System.out.println("가방의 총 가격은 " + sum + "입니다.");
    }
}

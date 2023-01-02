package template._02_after;

public class Client {

    public static void main(String[] args) {
        FileProcessor plus = new Plus("number.txt");
        int result = plus.process();
        System.out.println("result = " + result);

        FileProcessor multiply = new Multiply("number.txt");
        int result2 = multiply.process();
        System.out.println("result2 = " + result2);
    }
}

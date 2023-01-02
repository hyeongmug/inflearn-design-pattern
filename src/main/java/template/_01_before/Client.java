package template._01_before;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        int result = fileProcessor.process();
        System.out.println("result = " + result);

        MultiplyFileProcessor multiplyFileProcessor = new MultiplyFileProcessor("number.txt");
        int result2 = multiplyFileProcessor.process();
        System.out.println("result2 = " + result2);
    }
}

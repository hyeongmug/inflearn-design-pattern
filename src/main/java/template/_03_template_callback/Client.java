package template._03_template_callback;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        int result = fileProcessor.process(new Operator() {
            @Override
            public int getResult(int result, int number) {
                return result += number;
            }
        });
        System.out.println("result = " + result);


        // 람다식으로 사용할 수도 있음
        int result2 = fileProcessor.process((result1, number) -> result1 *= number);
        System.out.println("result2 = " + result2);
    }
}

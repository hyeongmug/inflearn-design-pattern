package singleton._10_java;

public class RuntimeExample {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        Runtime runtime1 = Runtime.getRuntime();
        System.out.println(runtime == runtime1); // true

        // Runtime은 싱글톤이다.
        // Runtime은 자바 프로그램이 시작될 때 자동으로 생성되는 객체이다.
    }
}


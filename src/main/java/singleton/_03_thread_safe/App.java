package singleton._03_thread_safe;

public class App {

    public static void main(String[] args) {
        Settings settings = Settings.getInstance();
        Settings settings1 = Settings.getInstance();

        System.out.println(settings == settings1); // true
    }
}

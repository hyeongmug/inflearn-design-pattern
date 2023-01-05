package singleton._04_thread_safe2;

public class App {

    public static void main(String[] args) {
        Settings settings = Settings.getInstance();
        Settings settings1 = Settings.getInstance();

        System.out.println(settings == settings1); // true
    }
}

package singleton._01_before;

public class App {

    public static void main(String[] args) {
        Settings settings = new Settings();
        Settings settings1 = new Settings();

        System.out.println(settings == settings1); // false
    }
}

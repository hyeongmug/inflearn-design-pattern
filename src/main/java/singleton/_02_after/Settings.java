package singleton._02_after;

public class Settings {

    private static Settings instance;

    private Settings() {
    }

    public static Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }
}
// 이 클래스는 멀티 쓰레드 환경에서 안전하지 않다.

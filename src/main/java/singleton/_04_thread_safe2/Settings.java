package singleton._04_thread_safe2;

public class Settings {

    private static final Settings INSTANCE = new Settings();

    private Settings() {
    }

    public static Settings getInstance() {
        return INSTANCE;
    }
}
// 이른 초기화(Eager Initialization) 방식을 사용해서 멀티 쓰레드 환경에서 안전하다.
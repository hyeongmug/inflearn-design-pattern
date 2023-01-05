package singleton._05_thread_safe3;

public class Settings {

    private static volatile Settings instance;

    private Settings() {
    }

    public static Settings getInstance() {
        if (instance == null) {
            synchronized (Settings.class) {
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }
        return instance;
    }
}
// Double-Checked Locking(DCL) 방식을 사용해서 멀티 쓰레드 환경에서 안전하다.

// volatile 키워드는 멀티 쓰레드 환경에서 변수의 값을 캐시하지 않고 메인 메모리에서 읽어오도록 한다.
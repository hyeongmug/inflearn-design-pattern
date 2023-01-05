package singleton._03_thread_safe;

public class Settings {

    private static Settings instance;

    private Settings() {
    }

    public static synchronized Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }
}
// 이 클래스는 synchronized 키워드를 사용해서 멀티 쓰레드 환경에서 안전하다.
// getInstance() 메소드가 동기화되어 있기 때문에 한 번에 하나의 쓰레드만 접근할 수 있다.
// 단점은 동기화 처리 방법 때문에 성능이 떨어진다.
package singleton._06_thread_safe_best;

public class Settings {

    private Settings() {
    }

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
// Static inner class를 사용하는 방법.
// SettingsHolder 클래스는 Settings 클래스가 로딩될 때 로딩되지 않는다.
// SettingsHolder 클래스가 로딩되는 시점은 getInstance() 메소드가 호출되는 시점이다.
// 이 때 클래스 로딩이 이루어지고, 이 때 static 변수인 INSTANCE가 생성된다.
// 이 방법은 Lazy Initialization 방식을 사용해서 멀티 쓰레드 환경에서 안전하다.
// 권장하는 방법중에 하나이다.
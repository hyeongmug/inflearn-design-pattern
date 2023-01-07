package singleton._08_serializable;

import java.io.Serializable;

public class Settings2 implements Serializable {

    private Settings2() {
    }

    private static class SettingsHolder {
        private static final Settings2 INSTANCE = new Settings2();
    }

    public static Settings2 getInstance() {
        return SettingsHolder.INSTANCE;
    }

    // 역직렬화 대응 방안
    // 역직렬화를 할 때, 원래는 새로운 객체를 생성해서 반환한다.
    // 하지만, 이렇게 되면, Singleton 패턴을 사용해서 객체를 생성하는 의미가 없어진다.
    // 이를 방지하기 위해서는, readResolve() 오버라이딩 해서, 원래의 객체를 반환하도록 해야 한다.
    protected Object readResolve() {
        return getInstance();
    }
}
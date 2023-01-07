package singleton._09_reflection_enum;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        // 리플렉션 사용하기
        Settings settings = Settings.INSTANCE;

        Settings settings1  = null;

        Constructor<?>[] declaredConstructors = Settings.class.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            constructor.setAccessible(true);
            settings1 = (Settings) constructor.newInstance("INSTANCE");
        }

        System.out.println(settings == settings1);
    }
}

// 안전하고 단순하게 싱글톤을 구현할 수 있는 방법
// enum을 사용하면, Reflection을 사용해서 객체를 생성할 수 없다.
// 결과 : Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects
//	at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:492)
//	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)
//	at singleton._09_reflection_enum.App.main(App.java:18)


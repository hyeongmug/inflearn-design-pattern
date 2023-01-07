package singleton._07_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        // 리플렉션 사용하기
        Settings settings = Settings.getInstance();

        Constructor<Settings> declaredConstructor = Settings.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true); // private 생성자에 접근할 수 있도록 설정
        Settings settings1 = declaredConstructor.newInstance(); // private 생성자를 호출해서 객체를 생성

        System.out.println(settings == settings1); // false
        
        // Reflection을 사용해서 객체를 생성하면, private 생성자를 사용해서 객체를 생성할 수 있다.
        // 이렇게 되면, Singleton 패턴을 사용해서 객체를 생성하는 의미가 없어진다.
        // 이를 방지하기 위해서는, 생성자를 private으로 선언하고, Reflection을 사용해서 객체를 생성할 수 없도록 해야 한다.
    }
}

package singleton._08_serializable;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {

        // 직렬화 & 역직렬화 사용하기
        Settings settings = Settings.getInstance();

        // 직렬화
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        // 역직렬화
        try(ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            Settings settings1 = (Settings) in.readObject();
            System.out.println(settings == settings1); // false
        }

        // 역직렬화 대응 방안
        // 역직렬화를 할 때, 원래는 새로운 객체를 생성해서 반환한다.
        // 하지만, 이렇게 되면, Singleton 패턴을 사용해서 객체를 생성하는 의미가 없어진다.
        // 이를 방지하기 위해서는, readResolve() 오버라이딩 해서, 원래의 객체를 반환하도록 해야 한다.
        Settings2 instance = Settings2.getInstance();
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings2.obj"))) {
            out.writeObject(instance);
        }

        try(ObjectInput in = new ObjectInputStream(new FileInputStream("settings2.obj"))) {
            Settings2 settings2 = (Settings2) in.readObject();
            System.out.println(instance == settings2); // true
        }

    }
}

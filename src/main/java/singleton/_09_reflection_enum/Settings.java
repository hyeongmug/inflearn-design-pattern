package singleton._09_reflection_enum;

public enum Settings {

    INSTANCE;

}

// 안전하고 단순하게 싱글톤을 구현할 수 있는 방법
// enum을 사용하면, Reflection을 사용해서 객체를 생성할 수 없다.

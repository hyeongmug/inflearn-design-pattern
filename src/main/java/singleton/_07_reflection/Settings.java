package singleton._07_reflection;

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
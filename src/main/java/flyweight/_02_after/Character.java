package flyweight._02_after;

public class Character {

    final char value;

    final String color;

    final Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}

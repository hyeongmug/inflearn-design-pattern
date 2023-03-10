package flyweight._02_after;

public class Font {

    final String font;

    final int size;

    public Font(String font, int size) {
        this.font = font;
        this.size = size;
    }

    public String getFont() {
        return font;
    }

    public int getSize() {
        return size;
    }

}

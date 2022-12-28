package flyweight._01_before;

public class Character {

        private char value;
        private String color;
        private String fontFaily;
        private int fontSize;

        public Character(char value, String color, String fontFamily, int fontSize) {
            this.value = value;
            this.color = color;
            this.fontFaily = fontFamily;
            this.fontSize = fontSize;
        }

}

package abstract_factory._02_after;

public class Ship {

    private String name;
    private String logo;
    private String color;

    private Wheel wheel;

    private Anchor anchor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", logo='" + logo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void setAnchor(Anchor whiteAnchor) {
        this.anchor = whiteAnchor;
    }

    public void setWheel(Wheel whiteWheel) {
        this.wheel = whiteWheel;
    }

    public Anchor getAnchor() {
        return this.anchor;
    }

    public Wheel getWheel() {
        return this.wheel;
    }
}

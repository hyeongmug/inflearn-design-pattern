package visitor._01_before;

public class Client {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.printTo(new Phone());
        rectangle.printTo(new Watch());

        Shape triangle = new Triangle();
        triangle.printTo(new Phone());
        triangle.printTo(new Watch());

        Shape circle = new Circle();
        circle.printTo(new Phone());
        circle.printTo(new Watch());

    }
}

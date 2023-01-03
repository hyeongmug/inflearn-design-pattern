package visitor._02_after;

public class Watch implements Device {

    @Override
    public void print(Circle circle) {
        System.out.println("Watch: print circle");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("Watch: print triangle");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("Watch: print rectangle");
    }
}

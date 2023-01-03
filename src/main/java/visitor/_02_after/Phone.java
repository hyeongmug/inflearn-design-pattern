package visitor._02_after;

public class Phone implements Device {

    @Override
    public void print(Circle circle) {
        System.out.println("Phone: print circle");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("Phone: print triangle");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("Phone: print rectangle");
    }
}

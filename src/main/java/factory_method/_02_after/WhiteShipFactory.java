package factory_method._02_after;

public class WhiteShipFactory implements ShipFactory {
    @Override
    public Ship createShip() {

        return new WhiteShip();
    }
}

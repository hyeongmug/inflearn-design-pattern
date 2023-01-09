package abstract_factory._02_after;

public class WhiteshipFactory implements ShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(this.shipPartsFactory.createAnchor());
        ship.setWheel(this.shipPartsFactory.createWheel());
        return ship;
    }
}

package abstract_factory._02_after;

public class WhiteshipPartsFactory implements ShipPartsFactory {
    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }
}


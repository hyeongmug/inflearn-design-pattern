package abstract_factory._02_after;

public class WhitePartsProFactory implements ShipPartsFactory {

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

}

package bridge.before;

public class KDA아리 implements Champion {
    @Override
    public void move() {
        System.out.println("아리가 이동합니다.");
    }

    @Override
    public void skillQ() {
        System.out.println("아리가 Q스킬을 사용합니다.");
    }

    @Override
    public void skillW() {
        System.out.println("아리가 W스킬을 사용합니다.");
    }

    @Override
    public void skillE() {
        System.out.println("아리가 E스킬을 사용합니다.");
    }

    @Override
    public void skillR() {
        System.out.println("아리가 R스킬을 사용합니다.");
    }
}

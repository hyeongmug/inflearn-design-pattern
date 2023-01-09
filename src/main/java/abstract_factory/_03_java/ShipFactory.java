package abstract_factory._03_java;
import abstract_factory._02_after.Ship;
import abstract_factory._02_after.WhiteShip;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() throws Exception {
        Ship ship = new WhiteShip();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}

// FactoryBean 인터페이스는 스프링 컨테이너가 직접 생성하는 것이 아니라, 구현한 객체에서 직접 생성하도록 위임하는 팩토리 패턴을 구현한 인터페이스이다.
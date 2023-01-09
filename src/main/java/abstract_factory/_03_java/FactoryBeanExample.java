package abstract_factory._03_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryBeanExample {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//        Ship whiteship = applicationContext.getBean("whiteship", Ship.class);
//        System.out.println(whiteship.getName());

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        ShipFactory bean = applicationContext.getBean(ShipFactory.class);
        System.out.println(bean);

    }
}

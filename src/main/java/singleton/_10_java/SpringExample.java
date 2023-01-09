package singleton._10_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        String hello = applicationContext.getBean("hello", String.class);
        String hello1 = applicationContext.getBean("hello", String.class);
        System.out.println(hello == hello1); // true
    }
}
// 스프링에서 빈의 스코프 중에 하나로 싱글톤 스코프.
// 스프링 빈은 기본이 싱글톤이다.

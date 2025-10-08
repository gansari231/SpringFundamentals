package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        Engine engine = applicationContext.getBean("engine1", Engine.class);
        engine.display();

        Engine engine2 = applicationContext.getBean("engine1", Engine.class);
        engine2.display();

        System.out.println(engine.hashCode());
        System.out.println(engine2.hashCode());

        Car car = applicationContext.getBean(Car.class);
        car.startCar();
    }
}

package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "org.example")
@PropertySource("classpath:application.properties")
public class SpringConfig {

    //Example for Java based configuration
    /*@Bean
    public Engine engine1() {
        return new Engine("V8","BMW");
    }

    @Bean
    public Engine engine2() {
        return new Engine("V7","Audi");
    }

    @Bean
    public Car car() {
        return new Car(engine1(), "SUV");
    }*/
}

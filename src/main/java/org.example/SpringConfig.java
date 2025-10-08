//Example for Java based configuration

package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
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
    }
}

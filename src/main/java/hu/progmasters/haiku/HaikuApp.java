package hu.progmasters.haiku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class HaikuApp {

    public static void main(String[] args) {
        SpringApplication.run(HaikuApp.class, args);
    }

    @Bean
    public Random getRandom() {
       return new Random();
    }
}

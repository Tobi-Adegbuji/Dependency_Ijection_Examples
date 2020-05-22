package edu.gsu.diexample.config;

import edu.gsu.diexample.controllers.JavaConfigExampleController;
import edu.gsu.diexample.services.GreetingService;
import edu.gsu.diexample.services.JavaConfigGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Configuration
public class JavaExampleConfig {

    @Bean
    public GreetingService greetingService() {
        return new JavaConfigGreetingService();
    }

    ;

    @Bean
    public JavaConfigExampleController javaConfigExampleController() {
        return new JavaConfigExampleController(greetingService());
    }
}
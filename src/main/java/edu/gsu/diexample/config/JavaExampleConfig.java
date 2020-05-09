package edu.gsu.diexample.config;

import edu.gsu.diexample.services.GreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//Profiles allow you have different beans in your config, In application properties you can choose which bean is active
//Default means if no profiles are active (in application properties), then this profile will get called
@Configuration
public class JavaExampleConfig implements GreetingService {

    @Override @Bean
    public String sayGreeting() {
        return "Dutch - DU";
    };
}

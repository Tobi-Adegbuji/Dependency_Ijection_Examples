package edu.gsu.diexample.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("de")
@Service("i18nService")
public class I18NGermanGreetingService implements GreetingService{


    @Override
    public String sayGreeting() {
        return " Hi in German";
    }
}

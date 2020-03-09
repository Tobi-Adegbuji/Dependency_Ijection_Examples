package edu.gsu.diexample.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
//Default means if no profiles are active, then this profile will get called
@Profile({"ES","default"})
@Service("i18nService")
public class I18nSpanishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}

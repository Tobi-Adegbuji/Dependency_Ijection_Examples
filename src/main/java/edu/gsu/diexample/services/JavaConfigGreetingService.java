package edu.gsu.diexample.services;

import org.springframework.stereotype.Service;

public class JavaConfigGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hi i am the Java based Configuration example!!!!";
    }
}

package edu.gsu.diexample.controllers;

import edu.gsu.diexample.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}

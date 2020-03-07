package edu.gsu.diexample.controllers;

import edu.gsu.diexample.services.GreetingService;

public class ConstructerInjectedController {

    private GreetingService greetingService;

    public ConstructerInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

package edu.gsu.diexample.controllers;

import edu.gsu.diexample.services.GreetingService;

public class XMLConfigExampleController {

    GreetingService greetingService;

    public XMLConfigExampleController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String greet(){
        return greetingService.sayGreeting();
    }

}

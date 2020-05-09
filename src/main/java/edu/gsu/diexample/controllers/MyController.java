package edu.gsu.diexample.controllers;

import edu.gsu.diexample.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    //No need for autowire for constructor injections
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String sayHello() {
        return greetingService.sayGreeting();
    }

}

package edu.gsu.diexample.controllers;

import edu.gsu.diexample.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

public class JavaConfigExampleController {

    private GreetingService greetingService;

    public JavaConfigExampleController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet(){
        return greetingService.sayGreeting();
    }


}

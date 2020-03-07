package edu.gsu.diexample.controllers;

import edu.gsu.diexample.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;


    //This is what us coder would write to implement dependency injection. Greeting
    //Service is a interface. Spring will handle the injection.
    // Qualifier tells spring what kind of service we want.

    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingServiceImpl") GreetingService greetingService){
        //This is an interface, so any thing that implements this can go here
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}

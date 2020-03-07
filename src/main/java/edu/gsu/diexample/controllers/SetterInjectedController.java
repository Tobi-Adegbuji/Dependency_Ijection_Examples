package edu.gsu.diexample.controllers;

import edu.gsu.diexample.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;


    //This is what us coder would write to implement dependency injection. Greeting
    //Service is a interface. Spring will handle the injection.
    public void setGreetingService(GreetingService greetingService){
        //This is an interface, so any thing that implements this can go here
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}

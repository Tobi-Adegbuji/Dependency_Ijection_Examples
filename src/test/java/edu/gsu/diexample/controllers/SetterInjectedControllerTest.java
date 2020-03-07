package edu.gsu.diexample.controllers;

import edu.gsu.diexample.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//This is what Spring is doing behind the curtains
class SetterInjectedControllerTest {

    //Makes an instance of our class
    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        //Then spring sets our class with some implementation
        //We are not making anything new. Spring is getting it for us.
        //Via the IoC Container
        controller.setGreetingService(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}
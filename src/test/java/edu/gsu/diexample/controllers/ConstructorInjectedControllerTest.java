package edu.gsu.diexample.controllers;

import edu.gsu.diexample.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructerInjectedController;

    @BeforeEach
    void setUp() {
        //We are just mimicking what the spring framework is doing
        //This is the most preferred method for DI
       constructerInjectedController = new ConstructorInjectedController(
               new ConstructorGreetingServiceImpl()
       );
    }

    @Test
    void getGreeting() {
        System.out.println(constructerInjectedController.getGreeting());
    }
}
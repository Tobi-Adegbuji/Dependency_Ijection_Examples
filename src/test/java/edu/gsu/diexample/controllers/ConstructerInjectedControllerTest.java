package edu.gsu.diexample.controllers;

import edu.gsu.diexample.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructerInjectedControllerTest {

    ConstructerInjectedController constructerInjectedController;

    @BeforeEach
    void setUp() {
        //We are just mimicking what the spring framework is doing
        //This is the most preferred method for DI
       constructerInjectedController = new ConstructerInjectedController(
               new GreetingServiceImpl()
       );
    }

    @Test
    void getGreeting() {
        System.out.println(constructerInjectedController.getGreeting());
    }
}
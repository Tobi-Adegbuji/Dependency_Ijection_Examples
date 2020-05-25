package edu.gsu.diexample.services;

public class XMLConfigGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hi, I was configured using an xml file!";
    }
}

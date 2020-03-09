package edu.gsu.diexample.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
//Primary means if a bean has no qualifier this will be the primary option service
//it will implement
@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY Bean";
    }
}

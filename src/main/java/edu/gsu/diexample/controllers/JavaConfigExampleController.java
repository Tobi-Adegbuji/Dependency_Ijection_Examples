package edu.gsu.diexample.controllers;

import edu.gsu.diexample.config.JavaExampleConfig;
import org.springframework.stereotype.Controller;

@Controller
public class JavaConfigExampleController {

    private JavaExampleConfig javaExampleConfig;

    public JavaConfigExampleController(JavaExampleConfig javaExampleConfig){
        this.javaExampleConfig = javaExampleConfig;
    }

    public String hi(){
        return javaExampleConfig.sayGreeting();
    }


}

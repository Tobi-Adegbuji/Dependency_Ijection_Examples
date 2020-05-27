package edu.gsu.diexample;

import edu.gsu.diexample.controllers.*;
import edu.gsu.diexample.examplebeans.FakeDataSource;
import edu.gsu.diexample.examplebeans.YAMLPetExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

//The power to choose how and what beans get injected is a great feature of spring
@SpringBootApplication
@ImportResource("classpath:xmlconfig.xml")
public class DiExampleApplication {

    public static void main(String[] args) {
        //This returns a context
        ApplicationContext ctx = SpringApplication.run(DiExampleApplication.class, args);
        //Now we have a handle on the spring application context

        //Because we annotated MyController class with @Controller, it is identified as a bean
        //We can now use ctx.getBeans for injection. The spring framework is managing the
        //construction of my controller. I am not creating the object myself. This demonstrates
        //inversion of control.
        MyController myController = (MyController) ctx.getBean("myController");
        //When spring creates beans, by default it makes it as the class name but starting with a lowercase letter.
        //That is why we use a lower case letter.

        System.out.println("--------- Primary Bean");
        System.out.println(myController.sayHello());

        System.out.println("--------- Property");
        //Make sure everything is annotated.
        // - PIController should have @Controller
        // - Property should be @Autowired, since we need to make an instance of it
        // - Greeting Service should be @Service, so it can be recognized as a spring managed component
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());


        System.out.println("------- Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());


        //Notice how you do not need to autowire constructors
        System.out.println("------- Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

        System.out.println("------- Profile Use Case");
        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        System.out.println("--------- Java Configuration Example");
        JavaConfigExampleController javaConfigExampleController = ctx.getBean("javaConfigExampleController", JavaConfigExampleController.class);
        System.out.println(javaConfigExampleController.greet());


        System.out.println("--------- XML Configuration Example");
        XMLConfigExampleController xmlConfigExampleController = ctx.getBean("xmlConfigBean", XMLConfigExampleController.class);
        System.out.println(xmlConfigExampleController.greet());


        System.out.println("----------- Properties Loading Example");
        FakeDataSource fakeDataSource = ctx.getBean("fakeDataSource", FakeDataSource.class);
        System.out.println(fakeDataSource);

        System.out.println("----------- Properties Loading Example with YAML");
        YAMLPetExample pet = ctx.getBean("petBean", YAMLPetExample.class);
        System.out.println(pet);

    }
    //Inversion of Control: it means giving the control of creating and instantiating the spring beans to
    // the Spring IOC container and the only work the developer does is configuring the beans


}

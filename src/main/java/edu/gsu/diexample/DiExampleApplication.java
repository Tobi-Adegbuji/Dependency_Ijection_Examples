package edu.gsu.diexample;

import edu.gsu.diexample.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiExampleApplication {

	public static void main(String[] args) {
		//This returns a context
		ApplicationContext ctx = SpringApplication.run(DiExampleApplication.class, args);
		//Now we have a handle on the spring application context

		//Because we annotated MyController class with @Component, it is identified as a bean
		//We can now use ctx.getBeans for injection. The spring framework is managing the
		//construction of my controller. I am not creating the object myself. This demonstrates
		//inversion of control.
		MyController myController = (MyController) ctx.getBean("myController");
		//When spring creates beans, by default it makes it as the class name but starting with a lowercase letter.
		//That is why we use a lower case letter.

		System.out.println(myController.sayHello());

	}
	//Inversion of Control: t means giving the control of creating and instantiating the spring beans to
	// the Spring IOC container and the only work the developer does is configuring the beans


}

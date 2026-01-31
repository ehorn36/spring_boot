package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*
In Spring Boot (and Spring MVC), a Controller is a Java class responsible for 
handling incoming HTTP requests from the outside world. It acts as the entry point for your application logic. 

In Spring Boot, @RestController is a specific type of controller annotation used to build RESTful web services.
*/
@RestController
public class HelloController {

    /*
    In Spring Boot, @RequestMapping is the annotation used to map web requests (URLs) 
    to specific classes and methods in your code. It acts as the Router.
     */
    @RequestMapping("/hello")
    public String sayHi() {
        return "Hi!";
    }

}

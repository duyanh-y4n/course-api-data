package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello") //defauft for GET methode
//    @RequestMapping(value = "/hello",method = RequestMethod.POST) //define like this if using another methode
    public String sayHello() {
        return "Hello";
    }
}


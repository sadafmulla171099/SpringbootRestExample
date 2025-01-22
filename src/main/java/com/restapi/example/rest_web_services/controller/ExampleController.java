package com.restapi.example.rest_web_services.controller;

import com.restapi.example.rest_web_services.model.HelloWorldBean;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExampleController {

//    @RequestMapping(method = RequestMethod.GET, path = "hello-world")
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World 1";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World Bean");
    }

    @GetMapping("/hello-world/pathVariable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean("Hello World : "+ name);
    }
}

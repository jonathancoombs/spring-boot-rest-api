package com.discoverorg.starters.controllers;

import com.discoverorg.starters.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public String helloWorld() {
        String currentUser = helloWorldService.getUser();
        return "Hello World, from " + currentUser;
    }
}

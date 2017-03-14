package com.discoverorg.starters.controllers;

import com.discoverorg.starters.resources.UserResource;
import com.discoverorg.starters.services.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public UserResource getUserById(
            @PathVariable Integer id
    ) {
        return userService.getUserById(id);
    }
}

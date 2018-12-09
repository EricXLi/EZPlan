package com.ezplan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ezplan.service.AccountService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        String success = String.valueOf(accountService.login());
        return success;
    }

    @RequestMapping(value = "/cool-cars", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<String> getCars() {
        String success = String.valueOf(accountService.login());
        List<String> cars = new ArrayList<>();
        cars.add("AMC Gremlin");
        cars.add("Triumph Stag");
        return cars;
    }

}

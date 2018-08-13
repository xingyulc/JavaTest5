package com.hand.api.controller;

import com.hand.api.service.CustomerService;
import com.hand.domain.entity.Customer;
import com.hand.domain.entity.LoginE;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {

    private Logger logger = (Logger) LoggerFactory.getLogger(FilmController.class);

    @Autowired
    private CustomerService customerService;

    @PostMapping("/login")
    public String login(@RequestBody LoginE loginE){
        logger.info("login………………");
        String responseText = "login false";
        Customer customer = customerService.findByName(loginE.getLast_name(),loginE.getPassword());
       if (customer != null) {
           responseText = "login success";
           logger.info("login success");
       }
        return responseText;
    }
}

package com.sunkuet02.springbootsample.controller;

import com.sunkuet02.springbootsample.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @ResponseBody
    @RequestMapping(value = "/greetings", method = RequestMethod.GET)
    public ResponseEntity<String> getAll() {
        return new ResponseEntity<String>(greetingService.hello(), HttpStatus.OK);
    }
}

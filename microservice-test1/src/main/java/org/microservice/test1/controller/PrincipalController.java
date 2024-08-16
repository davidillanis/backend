package org.microservice.test1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1/api")
public class PrincipalController {
    @GetMapping
    public String hello() {
        return "hello";
    }
}

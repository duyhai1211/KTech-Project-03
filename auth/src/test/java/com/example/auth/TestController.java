package com.example.auth;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("no-auth")
    public String noAuth() {

    }
}

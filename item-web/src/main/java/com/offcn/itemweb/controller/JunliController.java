package com.offcn.itemweb.controller;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class JunliController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/demo2")
    public void demo2(){};
}

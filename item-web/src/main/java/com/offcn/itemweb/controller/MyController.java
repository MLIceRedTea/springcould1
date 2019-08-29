package com.offcn.itemweb.controller;

import com.offcn.itemweb.service.RpcItemService;
import com.offcn.serviceiteam.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    RpcItemService rpcItemService;

    @GetMapping("/demo2")
    public List<Item> demo2(){
        return rpcItemService.getAllItems();
    }

    @GetMapping("/hello")
    public String hello(){
        return restTemplate.getForObject("http://service-item/hello",String.class);
    }

}

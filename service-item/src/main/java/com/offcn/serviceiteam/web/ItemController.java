package com.offcn.serviceiteam.web;


import com.offcn.serviceiteam.pojo.Item;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ItemController {

    //springcloud：web层当做服务
    //dubbo：service当做服务

    //    /item/2

    @Value("${server.port}")
    String port;

    @GetMapping("/item")
    public List<Item> getAllItems(){

        List<Item> list = new ArrayList<>();
        Item item = new Item();
        item.setId(1L);
        item.setName("联想电脑");
        item.setPrice(Float.parseFloat(port));
        Item item2 = new Item();
        item2.setId(1L);
        item2.setName("联想电脑");
        item2.setPrice(Float.parseFloat(port));
        list.add(item);
        list.add(item2);

        return list ;
    }

    @GetMapping("/item/{id}")
    public Item getItemById(@PathVariable Long id){
        Item item = new Item();
        item.setId(id);
        item.setName("测试商品");
        item.setPrice(Float.parseFloat(port));
        return  item;
    }

    @GetMapping("/hello")
    public String demo(){
        return "hello," + port;
    }




}

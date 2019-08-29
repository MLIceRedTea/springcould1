package com.offcn.serviceiteam.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
public class Item implements Serializable {

    private Long id;
    private String name;
    private float price;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}

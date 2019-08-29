package com.offcn.itemweb.controller;

import com.offcn.itemweb.service.RpcItemService;
import com.offcn.serviceiteam.pojo.Item;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LocalItemService implements RpcItemService {
    @Override
    public List<Item> getAllItems() {
        return null;
    }
}
package com.offcn.itemweb.service;

import com.offcn.itemweb.controller.LocalItemService;
import com.offcn.serviceiteam.pojo.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "service-item",fallback = LocalItemService.class)//服务名
public interface RpcItemService {
    @GetMapping("/item")
    public List<Item> getAllItems(); //参数  和 返回值   要和你即将远程调用的服务接口的参数和返回值一致
}

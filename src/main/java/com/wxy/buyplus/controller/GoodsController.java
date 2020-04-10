package com.wxy.buyplus.controller;

import com.wxy.buyplus.service.GoodsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
import java.text.ParseException;

@RequestMapping(value = "app")
@RestController
public class GoodsController {
    @Resource
    private GoodsService goodsService;

    @PostMapping(value = "/test")
    public String test() {
        System.out.println("123");
        return "123456";
    }

    @PostMapping(value = "/test2")
    public void test2() throws IOException, ParseException {
        goodsService.insertGoods();
    }
}

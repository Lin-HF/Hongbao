package com.hflcode.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;


@RequestMapping("/hello")
@RestController
public class HelloController {

    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/say")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") int id) {
//        return "说明" + limitConfig.getDescription();
        return "id: " + id;
    }

    @RequestMapping("/config")
    public LimitConfig config () {
        return limitConfig;
    }

//    @GetMapping("/hello2")
//    public String say2() {
//        return "index";
//    }
}

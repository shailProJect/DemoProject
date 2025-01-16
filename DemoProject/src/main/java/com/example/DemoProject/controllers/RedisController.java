package com.example.DemoProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @PostMapping("/set")
    public String setKeyValue(@RequestParam String key, @RequestParam String value) {
        redisTemplate.opsForValue().set(key, value);
        return "Key-Value pair set successfully!";
    }

    @GetMapping("/get")
    public String getValue(@RequestParam String key) {
        return (String) redisTemplate.opsForValue().get(key);
    }
    
}
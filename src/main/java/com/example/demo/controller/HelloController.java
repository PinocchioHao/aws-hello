package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class HelloController {

    @GetMapping("/hello")
    public List<Map<String, String>>  hello() {
        List<Map<String, String>> data = new ArrayList<>();

        Map<String, String> row1 = new HashMap<>();
        row1.put("id", "1");
        row1.put("name", "Alice");
        row1.put("age", "25");

        Map<String, String> row2 = new HashMap<>();
        row2.put("id", "2");
        row2.put("name", "Bob");
        row2.put("age", "30");

        data.add(row1);
        data.add(row2);

        return data;
    }
}

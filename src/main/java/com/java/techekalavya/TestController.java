package com.java.techekalavya;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @PostMapping("save")
    public String testPost(){
        System.out.println("Test post method called");
        return "Test Saved Successfully";
    }

    @GetMapping("fetch")
    public String testGet(){
        System.out.println("Test Get method called");
        return "Get Data is Here";
    }
}

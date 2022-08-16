package com.whosly.demo.controller;

import com.whosly.demo.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {
    @Autowired
    private IDemoService demoService;

    @GetMapping("/now")
    public Long now() {
        return demoService.nowLong();
    }

}

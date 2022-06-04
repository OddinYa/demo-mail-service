package ru.serzhir.demomailservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping()
public class Test {

    @GetMapping()
    public String getTest(){
        return "index";
    }
}

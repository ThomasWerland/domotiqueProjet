package com.example.henallux.domotique.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="test")
public class TestController {
    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model){
        return "integrated:test";
    }

    @RequestMapping(value="/send", method=RequestMethod.POST)
    public void getFormData(){
        System.out.println("test");
    }
}

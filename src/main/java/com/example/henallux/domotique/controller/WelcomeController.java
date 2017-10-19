package com.example.henallux.domotique.controller;


import com.example.henallux.domotique.model.UtilLogin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="login")
public class WelcomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String home (Model model){
        model.addAttribute("title", "test");
        model.addAttribute("log", new UtilLogin());
        return "integrated:login";
    }

    @RequestMapping(value="/send", method =RequestMethod.POST)
    public String getFormData(@ModelAttribute(value="log") UtilLogin form){
        return form.getLogin();
    }


}

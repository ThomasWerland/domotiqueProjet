package com.example.henallux.domotique.controller;


import com.example.henallux.domotique.dataAccess.dao.UserDAO;
import com.example.henallux.domotique.dataAccess.entity.UserEntity;
import com.example.henallux.domotique.dataAccess.util.ProviderConverter;
import com.example.henallux.domotique.model.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.Request;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "inscription")
public class InscriptionController {
    @Autowired
    private UserDAO userDAO;
    private ProviderConverter providerConverter = new ProviderConverter();
    @RequestMapping(method = RequestMethod.GET)
    public String home (Model model){
        model.addAttribute("userReg", new Register());
        return "integrated:inscription";
    }

    @RequestMapping(value="/sendUser", method =RequestMethod.POST)
    public String getFormData(@ModelAttribute(value="userReg") Register form){

        //if(!userDAO.alreadyReg(form)){
           // System.out.println("coucou");
        //}

        ArrayList<Register> arrayList = userDAO.getUsers();
        return "test";




    }

}

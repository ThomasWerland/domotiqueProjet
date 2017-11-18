package com.example.henallux.domotique.controller;

import com.example.henallux.domotique.dataAccess.dao.CategoryDAO;
import com.example.henallux.domotique.model.CategoryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
@RequestMapping(value="cata")
public class CatalogueCatController {
    @Autowired
    private CategoryDAO categoryDAO;
    @RequestMapping(method= RequestMethod.GET)
    public String home (Model model){
        ArrayList<CategoryModel> categoryModels = categoryDAO.getAllCategory();
        model.addAttribute(|)
        return "integrated:catalogueCat";
    }
}

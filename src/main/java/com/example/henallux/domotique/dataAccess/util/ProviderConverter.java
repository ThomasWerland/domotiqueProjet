package com.example.henallux.domotique.dataAccess.util;

import com.example.henallux.domotique.dataAccess.entity.CategoryEntity;
import com.example.henallux.domotique.dataAccess.entity.UserEntity;
import com.example.henallux.domotique.model.CategoryModel;
import com.example.henallux.domotique.model.Register;

public class ProviderConverter {


    public ProviderConverter(){

    }

    public CategoryEntity CategoryModelToCategoryEntity(CategoryModel categoryModel){
            CategoryEntity categoryEntity = new CategoryEntity();
            categoryEntity.setId(categoryModel.getId());
            return categoryEntity;
    }

    public CategoryModel categoryEntityToCategoryModel(CategoryEntity categoryEntity){
        CategoryModel categoryModel = new CategoryModel();
        categoryModel.setId(categoryEntity.getId());
        return categoryModel;
    }
}

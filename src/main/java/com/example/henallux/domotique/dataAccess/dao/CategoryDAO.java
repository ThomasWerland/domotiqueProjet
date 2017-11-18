package com.example.henallux.domotique.dataAccess.dao;

import com.example.henallux.domotique.dataAccess.entity.CategoryEntity;
import com.example.henallux.domotique.dataAccess.repository.CategoryRepository;
import com.example.henallux.domotique.dataAccess.repository.UserRepository;
import com.example.henallux.domotique.dataAccess.util.ProviderConverter;
import com.example.henallux.domotique.model.CategoryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CategoryDAO {

    private CategoryRepository categoryRepository;
    private ProviderConverter providerConverter;

    @Autowired
    public CategoryDAO(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    public ArrayList<CategoryModel> getAllCategory(){
        List<CategoryEntity> categoryEntities = categoryRepository.findAll();
        ArrayList<CategoryModel> categories = new ArrayList<>();
        for (CategoryEntity category : categoryEntities){
            CategoryModel categoryModel = providerConverter.categoryEntityToCategoryModel(category);
            categories.add(categoryModel);
        }

        return categories;
    }
}

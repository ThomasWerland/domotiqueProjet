package com.example.henallux.domotique.dataAccess.repository;

import com.example.henallux.domotique.dataAccess.entity.CategoryEntity;
import com.example.henallux.domotique.dataAccess.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, String>{

}

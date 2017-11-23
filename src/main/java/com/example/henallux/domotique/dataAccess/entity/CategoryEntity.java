package com.example.henallux.domotique.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name = "Category")
public class CategoryEntity {
    @Id
    @Column(name = "Id")
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}

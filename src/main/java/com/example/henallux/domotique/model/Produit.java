package com.example.henallux.domotique.model;


public class Produit {
    private String id;
    private double prix;
    private String description;
    private String cat;

    public Produit(){

    }


    public String getId() {
        return this.id;
    }

    public double getPrix() {
        return this.prix;
    }

    public String getDescription() {
        return this.description;
    }

    public String getCat() {
        return this.cat;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }
}

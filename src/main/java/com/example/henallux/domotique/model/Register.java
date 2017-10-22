package com.example.henallux.domotique.model;

public class Register {
    private String name;
    private String sirname;
    private String adress;
    private int adressNumber;
    private String town;
    private int postalCode;
    private String country;
    private int phoneNumber;
    private String emailAdress;

    public Register(){

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSirname(String sirname) {
        this.sirname = sirname;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setAdressNumber(int adressNumber) {
        this.adressNumber = adressNumber;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public void setCountry(String Country) {
        this.country = Country;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return this.name;
    }

    public String getSirname() {
        return this.sirname;
    }

    public String getAdress() {
        return this.adress;
    }

    public int getAdressNumber() {
        return this.adressNumber;
    }

    public String getTown() {
        return this.town;
    }

    public int getPostalCode() {
        return this.postalCode;
    }

    public String getCountry() {
        return this.country;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getEmailAdress() {
        return this.emailAdress;
    }
}

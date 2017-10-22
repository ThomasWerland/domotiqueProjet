package com.example.henallux.domotique.dataAccess.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserEntity {

    @Id
    @Column(name="emailAdresse")
    private String emailAdress;

    @Column(name = "name")
    private String name;

    @Column(name="sirname")

    private String sirname;

    @Column(name ="adress")

    private String adress;

    @Column(name="adressNumber")

    private int adressNum;

    @Column(name ="town")

    private String town;

    @Column(name="postalCode")

    private int postalCode;

    @Column(name = "country")

    private String country;

    @Column(name = "phoneNumber")

    private int phoneNumber;


    public UserEntity(){

    }


    public String getEmailAdress() {
        return this.emailAdress;
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

    public int getAdressNum() {
        return this.adressNum;
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

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
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

    public void setAdressNum(int adressNum) {
        this.adressNum = adressNum;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

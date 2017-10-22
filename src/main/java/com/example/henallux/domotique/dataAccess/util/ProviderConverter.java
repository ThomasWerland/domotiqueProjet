package com.example.henallux.domotique.dataAccess.util;

import com.example.henallux.domotique.dataAccess.entity.UserEntity;
import com.example.henallux.domotique.model.Register;

public class ProviderConverter {


    public ProviderConverter(){

    }

    public UserEntity userModelToUserEntity(Register register){
        UserEntity userEntity = new UserEntity();
        userEntity.setAdress(register.getAdress());
        userEntity.setAdressNum(register.getAdressNumber());
        userEntity.setCountry(register.getCountry());
        userEntity.setEmailAdress(register.getEmailAdress());
        userEntity.setName(register.getName());
        userEntity.setPhoneNumber(register.getPhoneNumber());
        userEntity.setPostalCode(register.getPostalCode());
        userEntity.setSirname(register.getSirname());
        userEntity.setTown(register.getTown());
        return userEntity;
    }

    public Register userEntityToRegister(UserEntity userEntity){
        Register register = new Register();
        register.setAdress(userEntity.getAdress());
        register.setAdressNumber(userEntity.getAdressNum());
        register.setCountry(userEntity.getCountry());
        register.setEmailAdress(userEntity.getEmailAdress());
        register.setName(userEntity.getName());
        register.setPhoneNumber(userEntity.getPhoneNumber());
        register.setPostalCode(userEntity.getPostalCode());
        register.setSirname(userEntity.getSirname());
        register.setTown(userEntity.getTown());
        return register;
    }
}

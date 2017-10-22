package com.example.henallux.domotique.dataAccess.dao;


import com.example.henallux.domotique.dataAccess.entity.UserEntity;
import com.example.henallux.domotique.dataAccess.repository.UserRepository;
import com.example.henallux.domotique.dataAccess.util.ProviderConverter;
import com.example.henallux.domotique.model.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import com.example.henallux.domotique.model.Register;
@Service
public class UserDAO {



    private UserRepository userRepository;

    @Autowired
    public UserDAO(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public ArrayList<Register> getUsers(){
        ProviderConverter providerConverter = new ProviderConverter();
        List<UserEntity> userEntities = userRepository.findAll();
        ArrayList<Register> arrayList = new ArrayList<>();
        for(UserEntity entity : userEntities ){
            Register register = providerConverter.userEntityToRegister(entity);
            arrayList.add(register);
        }
        return arrayList;

    }

    public Boolean alreadyReg(Register register){
        ProviderConverter providerConverter = new ProviderConverter();
        UserEntity userEntity = providerConverter.userModelToUserEntity(register);

        return userRepository.exists(userEntity.getEmailAdress());
    }

    public void saveUser(Register register){
        ProviderConverter providerConverter = new ProviderConverter();
        UserEntity userEntity = providerConverter.userModelToUserEntity(register);
        userRepository.save(userEntity);
    }
}

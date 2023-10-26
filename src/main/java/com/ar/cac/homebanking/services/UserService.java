package com.ar.cac.homebanking.services;

import com.ar.cac.homebanking.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private final UserRepository repository;

    public UserService(UserRepository repository){

        this.repository = repository;
    }

    public List<String>getUser(){
        List <String>nombres=List.of("Cristian","alejandro","Romina");
        return nombres;
    }
}

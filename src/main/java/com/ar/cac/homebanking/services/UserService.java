package com.ar.cac.homebanking.services;

import com.ar.cac.homebanking.mappers.UserMapper;
import com.ar.cac.homebanking.models.User;
import com.ar.cac.homebanking.models.dtos.UserDTO;
import com.ar.cac.homebanking.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    //inyectar una instancia al repositorio
    @Autowired
    private UserRepository repository;

  //metodos
    public List<UserDTO>getUsers(){
        //obtengo la lista de entidad usuario dela db
        List <User>users=repository.findAll();
        //Mapear cada usuario de la lissta hacia un dto
        List<UserDTO> usersDtos=users.stream()
                .map(UserMapper::userToDto)
                .collect(Collectors.toList());
        return usersDtos;
    }

    public UserDTO createUser(UserDTO userDto){
    User user = repository.save(UserMapper.dtoToUser(userDto));
    return UserMapper.userToDto(user);
    }
}

package com.ar.cac.homebanking.mappers;


import com.ar.cac.homebanking.models.User;
import com.ar.cac.homebanking.models.dtos.UserDTO;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserMappers {
    //Metodos para transformar objetos
    public static User dtoUser(UserDTO dto){
    User user = new User();

    user.setName(dto.getName());
    user.setSurname(dto.getSurname());
    user.setDni(dto.getDni());
    user.setEmail(dto.getEmail());
    user.setPassword(dto.getPassword());

    }
}

package com.ar.cac.homebanking.controllers;


import com.ar.cac.homebanking.models.dtos.UserDTO;
import com.ar.cac.homebanking.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class UserController {
    //Generar una instacia del service(UserService)-> inyectar una instacia mediante SpringBoot
  @Autowired
  private final UserService service;

  public UserController(UserService service) {

    this.service = service;
  }
    //Definir la url para cada solicitud
    //Para cada metodo http permitido debemos realizar una accion (get,post,put delete)
    //definir el DTO y el servicio (Inyeccion de dependecia)
    //CRUD (crear, leer, modificar, eliminar)
//TODO: refactorizar el método para que retorne un ResponseEntity de la lista UserDTO
    @GetMapping(value = "/users")
    public List<String> getUser(){
    List<String>lista=service.getUser();
    return lista;
    //quiero obtener la lista de usuarios
        //return List.of("Cristian","Martina","Lucas");
    }

    @GetMapping(value = "/user/{id}")
    public void getUserById(@PathVariable Long id){
      //quiero obtener un solo usuario
    }

    @PostMapping(value = "/users")
    public void createUser(@RequestBody UserDTO user){

    }

    public void updateAllUser(){
        //modificar al usuario por completo

    }

    public void updateUser(){
        //modificar al usuario parcialmente
    }

    public void deleteUser(){



    }



}

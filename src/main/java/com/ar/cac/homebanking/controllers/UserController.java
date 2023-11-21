package com.ar.cac.homebanking.controllers;


import com.ar.cac.homebanking.Exceptions.UserNotExistsException;
import com.ar.cac.homebanking.models.dtos.UserDTO;
import com.ar.cac.homebanking.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/users")
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

    @GetMapping
    public ResponseEntity<List<UserDTO>>getUsers(){
    List<UserDTO>lista=service.getUsers();
    return ResponseEntity.status(HttpStatus.OK).body(lista) ;

    }

    @GetMapping(value = "/{id}")
    public UserDTO getUserById(@PathVariable Long id){
      return ResponseEntity.status(HttpStatus.OK).body(service.getUserById(id)).getBody();
}
    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO user){
      return ResponseEntity.status(HttpStatus.CREATED).body(service.createUser(user));

    }
@PutMapping(value="/{id}")
    public void updateAllUser(){
        //modificar al usuario por completo

    }
@PatchMapping(value="/{id}")
    public void updateUser(@PathVariable long id){
        //modificar al usuario parcialmente
    }

@DeleteMapping(value="/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id){
      return ResponseEntity.status(HttpStatus.OK).body(service.deleteUser(id));
    }


}





package com.ar.cac.homebanking.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UserDTO {

    private Long id;

    private String name;

    private String surname;

    private String dni;

    private String email;

    private String password;



}

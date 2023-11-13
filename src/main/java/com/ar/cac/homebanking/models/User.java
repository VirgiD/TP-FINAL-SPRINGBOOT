package com.ar.cac.homebanking.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="usuarios")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="nombre")
    private String name;

    @Column(name ="apellido")
    private String surname;

    @Column(name ="dni")
    private String dni;

    @Column(name = "mail")
    private String email;

    @Column(name = "contrasena")
    private String password;

}

package com.ar.cac.homebanking.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="usuarios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
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

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL , orphanRemoval = true)
    private List<Account> accounts;

}

package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String nacimiento;

    @Column
    private String email;

    @Column
    private String clave;

    @Column
    private String confirmClave;

    @Column
    private String pais;

    // Constructor sin argumentos
    public Usuarios() {
    }

    // Constructor con argumentos
    public Usuarios(String nombre, String apellido, String nacimiento, String email, String clave, String confirmClave, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.email = email;
        this.clave = clave;
        this.confirmClave = confirmClave;
        this.pais = pais;
    }
}

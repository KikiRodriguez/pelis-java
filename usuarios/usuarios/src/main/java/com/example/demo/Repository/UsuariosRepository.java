package com.example.demo.Repository;

import com.example.demo.Model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository <Usuarios, Long> {

}

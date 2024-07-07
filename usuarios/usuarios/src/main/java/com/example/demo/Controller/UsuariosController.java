package com.example.demo.Controller;

import com.example.demo.Model.Usuarios;
import com.example.demo.Repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController


@CrossOrigin("http://127.0.0.1:5500")
public class UsuariosController {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @GetMapping("/mostrarUsuario")
    public List<Usuarios> getUsuarios(){
        return usuariosRepository.findAll();
    }

    @PostMapping("/guardarUsuario")
    public String saveUsuarios(@RequestBody Usuarios usuarios) {
        System.out.println("Datos recibidos: " + usuarios);
        usuariosRepository.save(usuarios);
        return "Usuario guardado";
    }

    @PutMapping("/modificarUsuario/{id}")
    public String modificarUsuarios(@PathVariable long id, @RequestBody Usuarios usuarios){
        Usuarios modificarUsuarios = usuariosRepository.findById(id).get();
        modificarUsuarios.setNombre(usuarios.getNombre());
        modificarUsuarios.setApellido(usuarios.getApellido());
        modificarUsuarios.setNacimiento(usuarios.getNacimiento());
        modificarUsuarios.setEmail(usuarios.getEmail());
        modificarUsuarios.setClave(usuarios.getClave());
        modificarUsuarios.setConfirmClave(usuarios.getConfirmClave());
        modificarUsuarios.setPais(usuarios.getPais());
        usuariosRepository.save(modificarUsuarios);
        return "Usuario modificado";
    }

    @DeleteMapping("/eliminarUsuario/{id}")
    public String eliminarUsuarios(@PathVariable long id){
        Usuarios eliminarUsuarios = usuariosRepository.findById(id).get();
        usuariosRepository.delete(eliminarUsuarios);
        return "Usuario eliminado";
    }

}

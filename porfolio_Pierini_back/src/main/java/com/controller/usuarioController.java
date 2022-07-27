package com.controller;

import com.models.usuario;

import com.service.usuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class usuarioController {
    private final usuarioService UsuarioService;

    public usuarioController(usuarioService usuarioService) {
        this.UsuarioService = usuarioService;
    }
    @GetMapping("/id/{id}")
    public ResponseEntity <usuario> getUsuario( @PathVariable ("id") long id){
        usuario Usuario = (usuario) UsuarioService.searchUser(id);
        return new ResponseEntity<>(Usuario, HttpStatus.OK);
    }
@PutMapping ("/update")
    public ResponseEntity <usuario> addUser(@RequestBody usuario Usuario){

            usuario updateUsuario = UsuarioService.addUser(Usuario);
            return new ResponseEntity<>(updateUsuario, HttpStatus.OK);
        }
    }


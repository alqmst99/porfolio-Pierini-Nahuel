
package com.Pierini.Portafolio.Controller;

import com.Pierini.Portafolio.Model.Usuario;
import com.Pierini.Portafolio.Service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final  UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
     @GetMapping("/id/{id}")

     public ResponseEntity<Usuario> getUser(@PathVariable("id") Long id){
         Usuario usuario=usuarioService.searchUser(id);
         return new ResponseEntity <>(usuario,HttpStatus.OK);
     }
    
     @PutMapping("/update")
     public ResponseEntity <Usuario> editUser(@RequestBody Usuario usuario){
         Usuario updateUser=usuarioService.editUser(usuario);
         return new ResponseEntity<>(updateUser,HttpStatus.OK);
     }
}

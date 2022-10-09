package com.Pierini.Portafolio.Security.Controller;

import com.Pierini.Portafolio.Controller.Mensaje;
import com.Pierini.Portafolio.Security.JWT.JwtProvider;
import com.Pierini.Portafolio.Security.Service.RolService;
import com.Pierini.Portafolio.Security.Service.UsuarioService;
import com.Pierini.Portafolio.Security.enums.RolName;
import com.Pierini.Portafolio.Segurity.Entity.Rol;
import com.Pierini.Portafolio.Segurity.Entity.Usuario;
import java.util.HashSet;
import java.util.Set;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Pieirni Nahuel Nicolas 
 */
@RestController
@RequestMapping("/Auth")
@CrossOrigin
public class AuthController {
    @Autowired
    PasswordEncoder passworEncoder;
    @Autowired
    AuthenticationManager authManager;
    @Autowired
    UsuarioService usuarioService;
    @Autowired
    RolService rolService;
    @Autowired
    JwtProvider jwtProvider;
    @PostMapping ("/new")
    //new user
    public ResponseEntity<?> nuevo(@Valid @RequestBody NuevoUsuario newUser, BindingResult bindingResult){
        if (bindingResult.hasErrors())
            return new ResponseEntity (new  Mensaje("Field poorly compose"), HttpStatus.BAD_REQUEST);
        if (usuarioService.existsByNameUser(nameUser.getNameUser()))
            return new ResponseEntity(new Mensaje("This User is a ready exist"),HttpStatus.BAD_REQUEST);
        if(usuarioService.existsByEmail(email.getEmail()))
            return new ResponseEntity(new Mensaje("This Email is a ready exist"),HttpStatus.BAD_REQUEST);
        Usuario usuario =new Usuario(newUser.getname(), newUser.getNameUser, newUser.getEmail(),PasswordEncoder(newUser.setPassword()));
        //Rol
        Set <Rol> roles= new HashSet<>();
        roles.add(rolService.getByRolName(RolName.ROLE_USER).get());
        
        if (newUser.getRoles().contains("admin<"));
        roles.add(rolService.getByRolName(RolName.ROLE_ADMIN).get());
        usuario.setRoles(roles);
        usuarioService.save(usuario);
return new ResponseEntity(new Mensaje("saved user"), HttpStatus.CREATED);
    }

}

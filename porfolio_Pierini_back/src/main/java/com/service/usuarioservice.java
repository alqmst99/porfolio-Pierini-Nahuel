package com.service;

import com.porfolio.ap.models.usuario;
import com.porfolio.ap.reporsitory.usuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class usuarioservice {
    private final usuarioRepo UsuarioRepo;

    public usuarioservice(usuarioRepo usuarioRepo) {
        this.UsuarioRepo = usuarioRepo;
    }

    @Autowired

    public usuario addUser( usuario Usuario){
        return UsuarioRepo.save (Usuario);
    }
    public List<usuario> searchUser(){
        return UsuarioRepo.findAll();
    }
    public usuario updateUser(usuario Usuario){
        return UsuarioRepo.save(Usuario);

    }
    public void borrarUser( Long id){
        UsuarioRepo.deleteById (id);
    }

}

package com.service;

import com.models.usuario;
import com.reporsitory.usuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional


public class usuarioService {
    private final usuarioRepo UsuarioRepo;
    @Autowired
    public usuarioService(usuarioRepo usuarioRepo) {
        this.UsuarioRepo = usuarioRepo;
    }



    public usuario addUser(usuario Usuario){
        return UsuarioRepo.save(Usuario);
    }
    public List<usuario> searchUser(long id){
        return UsuarioRepo.findAll();
    }
    public usuario updateUser(usuario Usuario){
        return UsuarioRepo.save(Usuario);

    }
    public void borrarEdu( Long id){
        UsuarioRepo.deleteById (id);
    }


}

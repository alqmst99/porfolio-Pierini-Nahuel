package com.porfolio.ap.userNotFoundException.service;

import com.porfolio.ap.models.usuario;
import com.porfolio.ap.reporsitory.usuarioRepo;
import com.porfolio.ap.userNotFoundException.userNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class usuarioService {
    private final usuarioRepo UsuarioRepo;

    public usuarioService(usuarioRepo usuarioRepo) {
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
    public usuario Usuarioid(long id){
        return UsuarioRepo.findById(id).orElseThrow(() -> new userNotFoundException ("the user not search"));
    }
}

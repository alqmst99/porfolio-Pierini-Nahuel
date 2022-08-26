package com.Pierini.Portafolio.Service;

import Except.UserNotFound;
import com.Pierini.Portafolio.Model.Usuario;
import com.Pierini.Portafolio.Repository.UsuarioRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsuarioService {
    private final UsuarioRepo usuarioRepo;
    @Autowired

    public UsuarioService(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }
    public Usuario addUser(Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    public List<Usuario> findUser(){
        return usuarioRepo.findAll();
    }
    public Usuario editUser(Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    public void supUser(Long id){
        usuarioRepo.deleteById(id);
    }
    public Usuario searchUser(long id){
        return usuarioRepo.findById(id).orElseThrow(()->new UserNotFound ("usuario no encontrado") );
    }
}

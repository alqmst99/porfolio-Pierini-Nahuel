

package com.Pierini.Portafolio.Security.Service;

import com.Pierini.Portafolio.Security.Entity.Usuario;
import com.Pierini.Portafolio.Security.Repository.IUsuarioRepo;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Pieirni Nahuel Nicolas 
 */
@Service
@Transactional
public class UsuarioService {
@Autowired
IUsuarioRepo iusuarioRepo;
public Optional<Usuario> getByNameUser(String nameUser){
    return iusuarioRepo.findByNameUser(nameUser);
}
public boolean existsByNameUser(String nameUser){
    return iusuarioRepo.existsByNameUser(nameUser);
}
public boolean existsByEmail(String email){
    return iusuarioRepo.existByEmail(email);
}
public void save(Usuario usuario){
  iusuarioRepo.save(usuario);
}
}
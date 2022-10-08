
package com.Pierini.Portafolio.Segurity.Repository;

import com.Pierini.Portafolio.Segurity.Entity.Rol;
import com.Pierini.Portafolio.Segurity.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nahue
 */
@Repository
public interface IUsuarioRepo extends JpaRepository<Rol, Object>{
    Optional<Usuario>findByNameUser(String nameUser);
    boolean existsByNameUser (String nameUser);
    boolean existByEmail (String email);

    public Optional<Usuario> findByUserName(String nameUser);

    public void save(Usuario usuario);
}

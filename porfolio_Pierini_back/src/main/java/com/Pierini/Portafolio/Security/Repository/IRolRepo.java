package com.Pierini.Portafolio.Security.Repository;

import com.Pierini.Portafolio.Security.Entity.Rol;
import com.Pierini.Portafolio.Security.enums.RolName;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nahue
 */
@Repository
public interface IRolRepo extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolName(String rolName);

    public Optional<Rol> findByRolName(RolName rolName);
}
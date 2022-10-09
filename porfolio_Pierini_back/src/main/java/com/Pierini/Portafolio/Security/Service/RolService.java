package com.Pierini.Portafolio.Security.Service;

import com.Pierini.Portafolio.Security.Entity.Rol;
import com.Pierini.Portafolio.Security.Repository.IRolRepo;
import com.Pierini.Portafolio.Security.enums.RolName;

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
public class RolService {

    @Autowired
    IRolRepo irolRepo;

    public Optional<Rol> getByRolName(RolName rolName) {
        return irolRepo.findByRolName(rolName);
    }
    public  void save(Rol rol){
        irolRepo.save(rol);
    }
}

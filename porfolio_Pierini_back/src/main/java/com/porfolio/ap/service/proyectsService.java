package com.porfolio.ap.service;

import com.porfolio.ap.models.education;
import com.porfolio.ap.models.proyects;
import com.porfolio.ap.reporsitory.proyectsRepo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.transaction.Transactional;
import java.util.List;

@Entity
@Transactional
public class proyectsService {
    private final proyectsRepo ProyectsRepo;
    @Autowired
    public proyectsService(proyectsRepo proyectsRepo) {
        this.ProyectsRepo = proyectsRepo;
    }

    public proyects addProy(proyects Proyects){
        return ProyectsRepo.save(Proyects);
    }
    public List<proyects> searchProy(){
        return ProyectsRepo.findAll();
    }
    public proyects updateProy(proyects Proyects){
        return ProyectsRepo.save(Proyects);

    }
    public void borrarProy( Long id){
        ProyectsRepo.deleteById (id);
    }
}

package com.Pierini.Portafolio.Service;

import com.Pierini.Portafolio.Model.Experience;
import com.Pierini.Portafolio.Repository.ExperienceRepo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienceService {
     private final ExperienceRepo experienceRepo;
    @Autowired

  
    /*CRUD*/
    public Experience addEdu(Experience experience){
        return experienceRepo.save(experience);
    }

    public ExperienceService(ExperienceRepo experienceRepo) {
        this.experienceRepo = experienceRepo;
    }
    public List<Experience> findEdu(){
      return experienceRepo.findAll();  
    }
    public Experience editEdu(Experience experience){
        return experienceRepo.save(experience);
        
    }
    public void  deleteEdu(long id){
        experienceRepo.deleteById(id);
    }
}

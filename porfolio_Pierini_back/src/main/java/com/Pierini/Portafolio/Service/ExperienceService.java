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

    public ExperienceService(ExperienceRepo experienceRepo) {
        this.experienceRepo = experienceRepo;
    }

   
    }
      public Experience addExp(Experience experience){
        return experienceRepo.save(Experience);
    }
    public List<Experience> findExp(){
      return experienceRepo.findAll();  
    }
    public Experience editExp(Experience experience){
        return experienceRepo.save(experience);
        
    }
    public void  deleteExp(long id){
        experienceRepo.deleteById(id);
    }
}

package com.porfolio.ap.service;

import com.porfolio.ap.models.education;
import com.porfolio.ap.models.experience;
import com.porfolio.ap.reporsitory.experienceRepo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.transaction.Transactional;
import java.util.List;

@Entity
@Transactional
public class experienceService {
    private final experienceRepo ExperienceRepo;
    @Autowired
    public experienceService(experienceRepo experienceRepo) {
        this.ExperienceRepo = experienceRepo;
    }



    public experience addExp(experience Experience){
        return ExperienceRepo.save(Experience);
    }
    public List<experience> searchExp(){
        return ExperienceRepo.findAll();
    }
    public experience updateExp(experience Experience){
        return ExperienceRepo.save(Experience);

    }
    public void borrarExp( Long id){
        ExperienceRepo.deleteById (id);
    }
}

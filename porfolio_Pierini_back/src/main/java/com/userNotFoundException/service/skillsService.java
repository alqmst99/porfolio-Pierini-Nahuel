package com.porfolio.ap.userNotFoundException.service;

import com.porfolio.ap.models.experience;
import com.porfolio.ap.models.skills;
import com.porfolio.ap.reporsitory.skillRepo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.transaction.Transactional;
import java.util.List;

@Entity
@Transactional
public class skillsService {
    private final skillRepo SkillRepo;
    @Autowired
    public skillsService(skillRepo skillRepo) {
        this.SkillRepo = skillRepo;
    }
    public skills addSkl(skills Skills){
        return SkillRepo.save(Skills);
    }
    public List<skills> searchSkl(){
        return SkillRepo.findAll();
    }
    public skills updateSkl(skills Skills){
        return SkillRepo.save(Skills);

    }
    public void borrarSkl( Long id){
        SkillRepo.deleteById (id);
    }

}

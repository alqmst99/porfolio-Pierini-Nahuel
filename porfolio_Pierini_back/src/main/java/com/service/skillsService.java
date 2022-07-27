package com.service;

import com.models.experience;
import com.models.skills;

import com.reporsitory.skillRepo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.transaction.Transactional;
import java.util.List;

@Entity
@Transactional
public class skillsService {
    private final skillRepo SkillRepo;

    public skillRepo getSkillRepo() {
        return SkillRepo;
    }

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

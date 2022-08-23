package com.Pierini.Portafolio.Service;
import com.Pierini.Portafolio.Model.Skill;
import com.Pierini.Portafolio.Repository.SkillRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillService {
    private final SkillRepo skillRepo;
    @Autowired

    public SkillService(SkillRepo skillRepo) {
        this.skillRepo = skillRepo;
    }
     public Skill addProj(Skill skill){
        return skillRepo.save(skill);
    }
    public List<Skill> findEdu(){
      return skillRepo.findAll();  
    }
    public Skill editProj(Skill skill){
        return skillRepo.save(skill);
        
    }
    public void  deleteProj(long id){
        skillRepo.deleteById(id);
    }
}
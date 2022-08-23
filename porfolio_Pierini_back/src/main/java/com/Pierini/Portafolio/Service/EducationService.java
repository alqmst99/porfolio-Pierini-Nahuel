package com.Pierini.Portafolio.Service;

import com.Pierini.Portafolio.Model.Education;
import com.Pierini.Portafolio.Repository.EducationRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducationService {
    private final EducationRepo educationRepo;
    @Autowired

    public EducationService(EducationRepo educationRepo) {
        this.educationRepo = educationRepo;
       
    }
    /*CRUD*/
    public Education addEdu(Education education){
        return educationRepo.save(education);
    }
    public List<Education> findEdu(){
      return educationRepo.findAll();  
    }
    public Education editEdu(Education education){
        return educationRepo.save(education);
        
    }
    public void  deleteEdu(long id){
        educationRepo.deleteById(id);
    }
    
}

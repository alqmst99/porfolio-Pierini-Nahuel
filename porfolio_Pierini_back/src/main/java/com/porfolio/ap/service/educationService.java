package com.porfolio.ap.service;

import com.porfolio.ap.models.education;
import com.porfolio.ap.reporsitory.educationRepo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class educationService {
    private final educationRepo EducationRepo;

    public educationService(educationRepo EducationRepo) {
        this.EducationRepo = EducationRepo;
    }
    public education addEducation(education Education){
        return EducationRepo.save(Education);
    }
    public List<education> searchEdu(){
        return EducationRepo.findAll();
    }
    public education updateEdu(education Education){
        return EducationRepo.save(education);

    }
}

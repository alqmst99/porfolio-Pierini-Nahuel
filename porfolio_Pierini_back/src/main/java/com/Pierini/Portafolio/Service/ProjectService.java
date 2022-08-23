package com.Pierini.Portafolio.Service;
import com.Pierini.Portafolio.Model.Project;
import com.Pierini.Portafolio.Repository.ProjectRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProjectService {
     private final ProjectRepo projectRepo;
    @Autowired

    public ProjectService(ProjectRepo projectRepo) {
        this.projectRepo= projectRepo;
       
    }
    /*CRUD*/
    public Project addProj(Project project){
        return projectRepo.save(project);
    }
    public List<Project> findEdu(){
      return projectRepo.findAll();  
    }
    public Project editProj(Project project){
        return projectRepo.save(project);
        
    }
    public void  deleteProj(long id){
        projectRepo.deleteById(id);
    }
}

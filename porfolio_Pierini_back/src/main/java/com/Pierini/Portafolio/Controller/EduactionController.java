
package com.Pierini.Portafolio.Controller;

import com.Pierini.Portafolio.Dto.DtoEducation;

import com.Pierini.Portafolio.Entity.Education;
import com.Pierini.Portafolio.Service.EducationService;

import java.util.List;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Pieirni Nahuel Nicolas 
 */
@RestController
@RequestMapping("/Education")
@CrossOrigin(origins="http://localhost:4200")
public class EduactionController {
    @Autowired 
    EducationService eduserv;
    @GetMapping("/list")
    public ResponseEntity <List<Education>> list(){
        List<Education> list=eduserv.list();
        return new ResponseEntity(list, HttpStatus.ACCEPTED);
    }
    //create education
    public ResponseEntity<?> create (@RequestBody DtoEducation dtoEdu){
        if (StringUtils.isBlank(dtoEdu.getNameE()))
        return new ResponseEntity(new Mensaje("the name is obligatory"),HttpStatus.BAD_REQUEST);
    
        
    if (eduserv.existByNameE(dtoEdu.getNameE())){
         return new ResponseEntity(new Mensaje ("the education i a ready exist"),HttpStatus.BAD_REQUEST);
   
        Education education = new Education(dtoEdu.getNameE(),dtoEdu.getDescE(),dtoEdu.getDateI(),dtoEdu.getDateF());
       eduserv.save(education);
       return new ResponseEntity (new Mensaje("education add's"),HttpStatus.ACCEPTED);
    
        }

    

}

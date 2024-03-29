package com.Pierini.Portafolio.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Pieirni Nahuel Nicolas 
 */
@Entity
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id ;
    private String name;
    private String imgP;
    private String descP;
    //constructors

   
    public Projects() {
    }

    
    public Projects(String name, String imgP, String descP) {
        this.name = name;
        this.imgP = imgP;
        this.descP = descP;
    }
    //getters & setters

    
    public int getId() {
        return id;
    }

   
    public void setId(int id) {
        this.id = id;
    }

  
    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name;
    }

  
    public String getImgP() {
        return imgP;
    }

   
    public void setImgP(String imgP) {
        this.imgP = imgP;
    }

    public String getDescP() {
        return descP;
    }

    
    public void setDescP(String descP) {
        this.descP = descP;
    }
    
}

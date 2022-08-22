
package com.Pierini.Portafolio.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skill {
    @Id @GeneratedValue(strategy=GenerationType.AUTO) 
     private Long idSkill;
    private String nameSkill;
    private String levelSkill;
    private String fotoSkill;

    

    

    public Skill() {
    }
public Skill(String fotoSkill) {
        this.fotoSkill = fotoSkill;
    }
    public Skill(Long idSkill, String nameSkill, String levelSkill) {
        this.idSkill = idSkill;
        this.nameSkill = nameSkill;
        this.levelSkill = levelSkill;
    }

    public Long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(Long idSkill) {
        this.idSkill = idSkill;
    }

    public String getNameSkill() {
        return nameSkill;
    }

    public void setNameSkill(String nameSkill) {
        this.nameSkill = nameSkill;
    }

    public String getLevelSkill() {
        return levelSkill;
    }

    public void setLevelSkill(String levelSkill) {
        this.levelSkill = levelSkill;
    }
    public String getFotoSkill() {
        return fotoSkill;
    }

    public void setFotoSkill(String fotoSkill) {
        this.fotoSkill = fotoSkill;
    }
}

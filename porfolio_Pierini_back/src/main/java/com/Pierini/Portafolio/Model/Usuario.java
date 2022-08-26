package com.Pierini.Portafolio.Model;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;







@Entity

public class Usuario implements Serializable {
    @Id @GeneratedValue(strategy=GenerationType.AUTO) 
    @Column(nullable=false, updatable=false )
    private long id;
    private  String name;
    private String lastName;
    private String tittle;
    private String desc; 
    private String fotoPerfil;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy ="idEdu")
   private List<Education> eduList; 
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy ="idExp")
    private List<Experience> expList; 
   
    @OneToMany(fetch = FetchType.LAZY, mappedBy ="idProy")
    private List<Project> projList; 
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy ="idSkill")
    private List<Skill> skillList; 
    
    public Usuario() {
    }

    public Usuario(long id, String name, String lastName, String tittle, String desc, String fotoPerfil) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.tittle = tittle;
        this.desc = desc;
        this.fotoPerfil = fotoPerfil;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }  
            
}

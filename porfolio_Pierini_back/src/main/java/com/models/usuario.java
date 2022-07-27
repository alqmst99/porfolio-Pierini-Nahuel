package com.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "usuario", indexes = {
        @Index(name = "idx_usuario_iduser", columnList = "idUser")
})
public class usuario implements Serializable {
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long idUser;
    private String nameUser;
    private String lastNameUser;
    private String TitleUser;
    private String descUser;
    private String imgUser;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
   private List< education>educationList;

    @OneToMany(fetch =  FetchType.LAZY, mappedBy = "idExp")
    private List<experience>experienceList;
    @OneToMany( fetch = FetchType.LAZY, mappedBy = "idSkill")
    private List< skills>skillsList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idProy")
    private List< proyects>proyectsList;

    public usuario() {
    }

    public usuario(long idUser, String nameUser, String lastNameUser, String titleUser, String descUser, String imgUser) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.lastNameUser = lastNameUser;
        TitleUser = titleUser;
        this.descUser = descUser;
        this.imgUser = imgUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public void setLastNameUser(String lastNameUser) {
        this.lastNameUser = lastNameUser;
    }

    public void setTitleUser(String titleUser) {
        TitleUser = titleUser;
    }

    public void setDescUser(String descUser) {
        this.descUser = descUser;
    }

    public void setImgUser(String imgUser) {
        this.imgUser = imgUser;
    }
}

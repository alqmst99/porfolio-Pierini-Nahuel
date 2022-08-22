
package com.Pierini.Portafolio.Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

 
@Entity

public class Experience {
  @Id @GeneratedValue(strategy=GenerationType.AUTO) 
   private Long idEdu;
   private String tituloExp;
   private Date  fechaIExp;
   private Date FechaFExp;
   private String imagenExp;

    public Experience() {
    }

    public Experience(Long idEdu, String tituloExp, Date fechaIExp, Date FechaFExp) {
        this.idEdu = idEdu;
        this.tituloExp = tituloExp;
        this.fechaIExp = fechaIExp;
        this.FechaFExp = FechaFExp;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public String getTituloExp() {
        return tituloExp;
    }

    public void setTituloExp(String tituloExp) {
        this.tituloExp = tituloExp;
    }

    public Date getFechaIExp() {
        return fechaIExp;
    }

    public void setFechaIExp(Date fechaIExp) {
        this.fechaIExp = fechaIExp;
    }

    public Date getFechaFExp() {
        return FechaFExp;
    }

    public void setFechaFExp(Date FechaFExp) {
        this.FechaFExp = FechaFExp;
    }

    public String getImagenExp() {
        return imagenExp;
    }

    public void setImagenExp(String imagenExp) {
        this.imagenExp = imagenExp;
    }

 
     
}

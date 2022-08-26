
package com.Pierini.Portafolio.Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

 
@Entity

public class Experience  {
  @Id @GeneratedValue(strategy=GenerationType.AUTO) 
   private Long idExp;
   private String tituloExp;
   private Date  fechaIExp;
   private Date FechaFExp;
   private String imagenExp;

    public Experience() {
    }

  

    public Experience(Long idExp, String tituloExp, Date FechaFExp, String imagenExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.FechaFExp = FechaFExp;
        this.imagenExp = imagenExp;
    }

   

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
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

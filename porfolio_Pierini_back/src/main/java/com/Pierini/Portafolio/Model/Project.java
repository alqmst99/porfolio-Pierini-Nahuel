/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pierini.Portafolio.Model;


import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity


public class Project {
      @Id @GeneratedValue(strategy=GenerationType.AUTO) 
   private Long idProy;
   private String tituloProy;        
   private Date  fechaIProy;
   private Date FechaFProy;
   private String imagenProy;

    public Project() {
    }

    public Project(Long idProy, String tituloProy, Date fechaIProy, Date FechaFProy, String imagenProy) {
        this.idProy = idProy;
        this.tituloProy = tituloProy;
        this.fechaIProy = fechaIProy;
        this.FechaFProy = FechaFProy;
        this.imagenProy = imagenProy;
    }

    public Long getIdPoy() {
        return idProy;
    }

    public void setIdPoy(Long idProy) {
        this.idProy = idProy;
    }

    public String getTituloProy() {
        return tituloProy;
    }

    public void setTituloProy(String tituloProy) {
        this.tituloProy = tituloProy;
    }

    public Date getFechaIProy() {
        return fechaIProy;
    }

    public void setFechaIProy(Date fechaIProy) {
        this.fechaIProy = fechaIProy;
    }

    public Date getFechaFProy() {
        return FechaFProy;
    }

    public void setFechaFProy(Date FechaFProy) {
        this.FechaFProy = FechaFProy;
    }

    public String getImagenProy() {
        return imagenProy;
    }

    public void setImagenProy(String imagenProy) {
        this.imagenProy = imagenProy;
    }
   
    
}

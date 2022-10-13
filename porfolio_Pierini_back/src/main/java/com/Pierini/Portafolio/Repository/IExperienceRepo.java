/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Pierini.Portafolio.Repository;

import com.Pierini.Portafolio.Entity.Experience;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pierini Nahuel Nicolas
 */
@Repository
public interface IExperienceRepo extends JpaRepository<Experience, Integer>{
    public Optional<Experience>findByNameE(String nameE);
    public boolean ExistsbyNameE(String nameE);
    
}

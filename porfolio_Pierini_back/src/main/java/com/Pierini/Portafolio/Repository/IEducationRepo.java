
package com.Pierini.Portafolio.Repository;

import com.Pierini.Portafolio.Entity.Education;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Pierini Nahuel Nicolas
 */
public interface IEducationRepo extends JpaRepository<Education, Integer>{
    public Optional<Education>findByNameE(String nameE);
    public boolean existsByNameE(String nameE);
}

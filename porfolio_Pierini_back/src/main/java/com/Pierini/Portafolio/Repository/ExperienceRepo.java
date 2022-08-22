package com.Pierini.Portafolio.Repository;

import com.Pierini.Portafolio.Model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepo extends JpaRepository <Experience, Long> {
}

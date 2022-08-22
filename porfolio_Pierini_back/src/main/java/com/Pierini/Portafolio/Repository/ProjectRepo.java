package com.Pierini.Portafolio.Repository;

import com.Pierini.Portafolio.Model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository <Project,Long> {
}

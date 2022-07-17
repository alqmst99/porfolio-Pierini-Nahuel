package com.porfolio.ap.reporsitory;

import com.porfolio.ap.models.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarioRepo extends JpaRepository<usuario, Long > {
}

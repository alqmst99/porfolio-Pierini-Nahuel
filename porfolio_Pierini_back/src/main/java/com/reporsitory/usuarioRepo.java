package com.reporsitory;

import com.models.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarioRepo extends JpaRepository<usuario, Long > {
}

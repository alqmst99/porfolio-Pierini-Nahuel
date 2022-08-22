package com.Pierini.Portafolio.Repository;

import com.Pierini.Portafolio.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends  JpaRepository <Usuario, Long>{
}

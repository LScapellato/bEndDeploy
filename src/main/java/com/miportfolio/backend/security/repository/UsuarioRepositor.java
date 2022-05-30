package com.miportfolio.backend.security.repository;





import com.miportfolio.backend.security.entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepositor extends JpaRepository <Usuario, Integer>{
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    Optional<Usuario> findByEmail (String email);
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);
}

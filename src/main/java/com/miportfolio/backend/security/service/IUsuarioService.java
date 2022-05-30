
package com.miportfolio.backend.security.service;



import com.miportfolio.backend.security.entity.Usuario;
import java.util.List;


public interface IUsuarioService {
    
    public List<Usuario> getUsuarios();
    public void saveUsuario (Usuario usuario);
    public void deleteUsuario(int id);
    public Usuario findUsuario(int id);
    public Usuario findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
    public boolean existsById(int id);
    public boolean existsByEmail(String email);

}

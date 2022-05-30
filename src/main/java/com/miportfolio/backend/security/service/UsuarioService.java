package com.miportfolio.backend.security.service;




import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miportfolio.backend.security.entity.Usuario;
import com.miportfolio.backend.security.repository.UsuarioRepositor;

@Service
@Transactional //para coherencia en bd accesos compartidos
public class UsuarioService implements IUsuarioService {

    @Autowired //anotacion para implementar dependencias
    public UsuarioRepositor userRepo;

    
//    public List<Usuario> getUsuarios() {
//        return userRepo.findAll();
//    }
//
//    
//    public void saveUsuario(Usuario user) {
//        userRepo.save(user);
//    }
//
//    
//    public void deleteUsuario(Long id) {
//        userRepo.deleteById(id);
//    }
//
//    
//    public Usuario findUsuario(Long id) {
//        return userRepo.findById(id).orElse(null);
//
//    }
//    
//    public Optional <Usuario> getByNombreUsuario (String nombreUsuario){
//        return userRepo.findByNombreUsuario(nombreUsuario);
//    }
//    
//    public boolean existsByNombreUsuario(String nombreUsuario){
//        return userRepo.existsByNombreUsuario(nombreUsuario);
//        
//    }
//    
//    public boolean existsByEmail(String email){
//        return userRepo.existsByEmail(email);
//    }
//    
//    public Optional <Usuario> getByEmail (String email){
//        return userRepo.findByEmail(email);
//    }
//
//    private static class UsuarioRepositor {
//
//        public UsuarioRepositor() {
//        }
//    }

    @Override
    public List<Usuario> getUsuarios() {
        return userRepo.findAll();
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        userRepo.save(usuario);
    }

    @Override
    public void deleteUsuario(int id) {
        userRepo.deleteById(id);
    }

    @Override
    public Usuario findUsuario(int id) {
         Usuario user = userRepo.findById(id).orElse(null);
         return user;
                 
    }

    @Override
    public Usuario findByNombre(String nombre) {
        Usuario user = userRepo.findByNombreUsuario(nombre).orElse(null);
        return user;
    }

    @Override
    public boolean existsByNombre(String nombre) {
        return userRepo.existsByNombreUsuario(nombre);
      
    }

    @Override
    public boolean existsById(int id) {
        return userRepo.existsById(id);
    }

    @Override
    public boolean existsByEmail(String email) {
        return userRepo.existsByEmail(email);
    }
}
  
   
    
    
    
 

    
    
    
    
    
    


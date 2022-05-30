
package com.miportfolio.backend.security.service;


import com.miportfolio.backend.security.entity.Usuario;
import com.miportfolio.backend.security.entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;//service de spring security
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    
    @Autowired
    UsuarioService usuarioService;
    
    
    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.findByNombre(nombreUsuario);
        return UsuarioPrincipal.build(usuario);
    }

   

    
 
    
}

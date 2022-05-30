
package com.miportfolio.backend.security.service;



import com.miportfolio.backend.security.entity.Rol;
import com.miportfolio.backend.security.enums.RolName;
import com.miportfolio.backend.security.repository.RolRepository;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class RolService {
    
    @Autowired
    RolRepository rolRepository;
    
    public Optional <Rol> getByRolName(RolName rolName){
        return rolRepository.findByRolName(rolName);
    }
    
    public void save(Rol rol) {
        rolRepository.save(rol);
    }
}

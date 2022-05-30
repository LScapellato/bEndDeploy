//
//package com.miportfolio.backend.security.util;
//
//
//import com.miportfolio.backend.security.entity.Rol;
//import com.miportfolio.backend.security.enums.RolName;
//import com.miportfolio.backend.security.service.RolService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//
//@Component
//public class CreateRoles implements CommandLineRunner {
//    
////    lo ejecutamos solo una vez para crear los roles. ...
//    @Autowired
//    RolService rolService;
//    
//    @Override
//    public void run(String... args) throws Exception {
//        Rol rolAdmin = new Rol(RolName.ROLE_ADMIN);
//        Rol rolUser = new Rol(RolName.ROLE_USER);
//        rolService.save(rolAdmin);
//        rolService.save(rolUser);
//       
//    }
//    
//}

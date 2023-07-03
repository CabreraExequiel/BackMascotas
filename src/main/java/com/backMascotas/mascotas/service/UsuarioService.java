
package com.backMascotas.mascotas.service;

import com.backMascotas.mascotas.model.Usuario;
import com.backMascotas.mascotas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    public UsuarioRepository userRepo;
    
    
     public Usuario authenticate(String email, String password) {
        Usuario user = userRepo.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        } else {
            return null;
        }
    }
}

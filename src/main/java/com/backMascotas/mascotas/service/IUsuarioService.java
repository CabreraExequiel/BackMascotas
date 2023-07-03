
package com.backMascotas.mascotas.service;

import com.backMascotas.mascotas.model.Usuario;


public interface IUsuarioService {
    public Usuario authenticate(String email, String password);
}

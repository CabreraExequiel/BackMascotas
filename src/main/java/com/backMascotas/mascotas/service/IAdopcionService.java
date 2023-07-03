
package com.backMascotas.mascotas.service;

import com.backMascotas.mascotas.model.Adopcion;
import java.util.List;


public interface IAdopcionService {
    public void crearAdopcion(Adopcion adop);
    public List<Adopcion> verAdopcion();
    
}

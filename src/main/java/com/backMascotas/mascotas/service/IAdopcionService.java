
package com.backMascotas.mascotas.service;

import com.backMascotas.mascotas.model.Adopcion;
import com.backMascotas.mascotas.model.Perdidos;
import java.util.List;


public interface IAdopcionService {
    public void crearAdopcion(Adopcion adop);
    public List<Adopcion> verAdopcion();

    public Adopcion obtenerAdopcionPorId(Long id);

    public void eliminarAdopcion(Long id);
    
}

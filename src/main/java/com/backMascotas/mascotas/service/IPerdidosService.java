
package com.backMascotas.mascotas.service;

import com.backMascotas.mascotas.model.Perdidos;
import java.util.List;


public interface IPerdidosService {
    public List<Perdidos> verMascotas();
    public void crearMascotas(Perdidos per);
}

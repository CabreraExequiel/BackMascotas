
package com.backMascotas.mascotas.service;

import com.backMascotas.mascotas.model.Adopcion;
import com.backMascotas.mascotas.repository.AdopcionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdopcionService implements IAdopcionService{

    @Autowired
    public AdopcionRepository adRepo;
    
    @Override
    public void crearAdopcion(Adopcion adop) {
        adRepo.save(adop);
    }

    @Override
    public List<Adopcion> verAdopcion() {
        return adRepo.findAll();
    }
    
}


package com.backMascotas.mascotas.service;

import com.backMascotas.mascotas.model.Perdidos;
import com.backMascotas.mascotas.repository.PerdidosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerdidosService implements IPerdidosService{
    
    @Autowired
    public PerdidosRepository perRepo;
    
    @Override
    public List<Perdidos> verMascotas() {
       return perRepo.findAll();
    }    

    @Override
    public void crearMascotas(Perdidos per) {
        perRepo.save(per);
    }

    @Override
    public Perdidos obtenerMascotaPorId(Long id) {
return perRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminarMascota(Long id) {
        perRepo.deleteById(id);
    }
    
    

}

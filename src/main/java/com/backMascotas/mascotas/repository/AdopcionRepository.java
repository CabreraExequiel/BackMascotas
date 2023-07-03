
package com.backMascotas.mascotas.repository;

import com.backMascotas.mascotas.model.Adopcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdopcionRepository extends JpaRepository<Adopcion, Long>{
    
}

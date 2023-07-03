
package com.backMascotas.mascotas.repository;

import com.backMascotas.mascotas.model.Perdidos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PerdidosRepository extends JpaRepository<Perdidos, Long>{
    
}


package com.backMascotas.mascotas.repository;

import com.backMascotas.mascotas.model.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    Usuario findByEmail (String email);
   Optional<Usuario> findOneByEmail(String email);
}

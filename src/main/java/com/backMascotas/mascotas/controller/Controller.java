
package com.backMascotas.mascotas.controller;

import com.backMascotas.mascotas.model.Adopcion;
import com.backMascotas.mascotas.model.Perdidos;
import com.backMascotas.mascotas.model.Usuario;
import com.backMascotas.mascotas.service.IAdopcionService;
import com.backMascotas.mascotas.service.IPerdidosService;
import com.backMascotas.mascotas.service.UsuarioService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://appmascotas10.web.app", allowedHeaders = "*")
public class Controller {
    
    @Autowired
    public IPerdidosService perService;
    @Autowired
    public IAdopcionService adService;
    @Autowired
    public UsuarioService userService;
    
    
    @PostMapping("/nueva/mascota")
    public void agregarMascotas(@RequestBody Perdidos per){
        perService.crearMascotas(per);
    }
    
    @GetMapping("/ver/mascota")
    @ResponseBody
    public List<Perdidos> verMascotas(){
        return perService.verMascotas();
    }
    
    @PostMapping("/nueva/adopcion")
    public void crearAdopcion(@RequestBody Adopcion adop){
        adService.crearAdopcion(adop);
    }
    
   @GetMapping("/ver/adopcion")
    @ResponseBody
    public List<Adopcion> verAdopcion(){
        return adService.verAdopcion();
    }
    
    @PostMapping("/login")
  public ResponseEntity<Usuario> login(@RequestBody Map<String, String> credentials) {
    String email = credentials.get("email");
    String password = credentials.get("password");
    Usuario user = userService.authenticate(email, password);
    if (user != null) {
      return ResponseEntity.ok(user);
    } else {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
  }

     @DeleteMapping("/eliminar/mascota/{id}")
    public ResponseEntity<String> eliminarMascota(@PathVariable Long id) {
        try {
    // Verificar si la mascota existe en la base de datos
    Perdidos mascota = perService.obtenerMascotaPorId(id);
    if (mascota == null) {
        // La mascota no existe, retornar un error o una respuesta indicando que no se encontró la mascota
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró la mascota");
    }

    // Eliminar la mascota de la base de datos
    perService.eliminarMascota(id);

    return ResponseEntity.ok("Mascota eliminada correctamente");
} catch (Exception e) {
    // En caso de cualquier error, retornar un error o una respuesta indicando el fallo
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al eliminar la mascota");
}}

@DeleteMapping("/eliminar/adopcion/{id}")
    public ResponseEntity<String> eliminarAdopcion(@PathVariable Long id) {
        try {
    // Verificar si la mascota existe en la base de datos
    Adopcion mascota = adService.obtenerAdopcionPorId(id);
    if (mascota == null) {
        // La mascota no existe, retornar un error o una respuesta indicando que no se encontró la mascota
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró la mascota");
    }

    // Eliminar la mascota de la base de datos
    adService.eliminarAdopcion(id);

    return ResponseEntity.ok("Mascota eliminada correctamente");
} catch (Exception e) {
    // En caso de cualquier error, retornar un error o una respuesta indicando el fallo
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al eliminar la mascota");
}

    
}}

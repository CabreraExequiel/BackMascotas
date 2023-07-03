
package com.backMascotas.mascotas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Adopcion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String url_img;
    private String raza;
    private String edad;
    private String sexo;
    private String descripcion;
    
    private Adopcion(){
        
    }
    
    private Adopcion(Long id, String url_img, String raza, String edad, String sexo, String descripcion){
        this.id = id;
        this.url_img = url_img;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
        this.descripcion = descripcion;
    }
    
}

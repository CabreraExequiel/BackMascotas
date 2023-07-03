
package com.backMascotas.mascotas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Perdidos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String url_img;
    private String raza;
    private String descripcion;
    private String fecha;
    private String ubicacion;
    
    public Perdidos(){
        
    }
    
    public Perdidos(Long id, String url_img, String raza, String descripcion, String fecha, String ubicacion){
        this.id = id;
        this.raza = raza;
        this.descripcion = descripcion; 
        this.fecha = fecha; 
        this.ubicacion = ubicacion;
        this.url_img = url_img;
    }
    
}

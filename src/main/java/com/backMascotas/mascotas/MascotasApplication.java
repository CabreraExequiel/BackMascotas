package com.backMascotas.mascotas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.backMascotas.mascotas.repository", "com.backMascotas.mascotas.service", "com.backMascotas.mascotas.controller"})
@EntityScan(basePackages = "com.backMascotas.mascotas.model")
public class MascotasApplication {

    public static void main(String[] args) {
        SpringApplication.run(MascotasApplication.class, args);
    }

}

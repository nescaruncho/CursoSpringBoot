package es.campusmvp.pruebas.casa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PuertaConfig {

    @Bean
    public Puerta puerta(){
        return new Puerta("madera");
    }
}

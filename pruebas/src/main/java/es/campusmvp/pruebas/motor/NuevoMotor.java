package es.campusmvp.pruebas.motor;

import org.springframework.context.annotation.Bean;

public class NuevoMotor {

    private final String tipo;

    public NuevoMotor(String tipo) {
        this.tipo = tipo;
    }

    public void arrancar() {
        System.out.println("Arrancando motor de tipo " +tipo);
    }

    public void apagar() {
        System.out.println("Apagando motor de tipo " +tipo);
    }
}

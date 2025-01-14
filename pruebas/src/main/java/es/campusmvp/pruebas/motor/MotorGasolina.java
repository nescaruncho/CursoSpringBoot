package es.campusmvp.pruebas.motor;

import org.springframework.stereotype.Component;

@Component("gasolina")
public class MotorGasolina implements Motor {
    @Override
    public void arrancar() {
        System.out.println("Motor gasolina encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Motor gasolina apagado");
    }
}

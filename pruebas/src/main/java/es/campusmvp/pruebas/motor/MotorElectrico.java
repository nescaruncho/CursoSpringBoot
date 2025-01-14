package es.campusmvp.pruebas.motor;

import org.springframework.stereotype.Component;

@Component("electrico")
public class MotorElectrico implements Motor {
    @Override
    public void arrancar() {
        System.out.println("Motor eléctrico encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Motor eléctrico apagado");
    }
}

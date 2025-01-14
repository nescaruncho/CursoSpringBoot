package es.campusmvp.pruebas.motor.coches;

import es.campusmvp.pruebas.motor.NuevoMotor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CocheGasolina {

    private final NuevoMotor motor;

    @Autowired
    public CocheGasolina(@Qualifier("motorGasolina") NuevoMotor motor) {
        this.motor = motor;
    }

    public void conducir() {
        motor.arrancar();
        System.out.println("Conduciendo coche de gasolina");
        motor.apagar();
    }
}

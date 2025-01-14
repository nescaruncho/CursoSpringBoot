package es.campusmvp.pruebas.motor.coches;

import es.campusmvp.pruebas.motor.NuevoMotor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CocheElectrico {

    private final NuevoMotor motor;

    @Autowired
    public CocheElectrico(@Qualifier("motorElectrico") NuevoMotor motor) {
        this.motor = motor;
    }

    public void conducir() {
        motor.arrancar();
        System.out.println("Conduciendo coche eléctrico");
        motor.apagar();
    }
}

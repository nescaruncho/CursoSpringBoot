package es.campusmvp.pruebas.motor.coches;

import es.campusmvp.pruebas.motor.NuevoMotor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Coche {

    private final List<NuevoMotor> nuevoMotorList;

    public Coche(final List<NuevoMotor> nuevoMotorList){
        this.nuevoMotorList = nuevoMotorList;
    }

    public void arrancarTodo(){
        System.out.println("Arrancando todos los coches");
        for (NuevoMotor motor : nuevoMotorList) {
            motor.arrancar();
        }
    }

    public void apagarTodo(){
        System.out.println("Apagando todos los coches");
        for (NuevoMotor motor : nuevoMotorList) {
            motor.apagar();
        }
    }
}

package es.campusmvp.pruebas;

import es.campusmvp.pruebas.motor.coches.Coche;
import es.campusmvp.pruebas.motor.coches.CocheElectrico;
import es.campusmvp.pruebas.motor.coches.CocheGasolina;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PruebasApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PruebasApplication.class, args);

		Coche coche = context.getBean(Coche.class);
		coche.arrancarTodo();
		coche.apagarTodo();

	}

}

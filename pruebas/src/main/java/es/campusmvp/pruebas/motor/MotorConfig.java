package es.campusmvp.pruebas.motor;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class MotorConfig {

    @Bean
    @Qualifier("motorGasolina")
    @Order(2)
    public NuevoMotor motorGasolina() {
        return new NuevoMotor("gasolina");
    }

    @Bean
    @Qualifier("motorElectrico")
    @Order(1)
    public NuevoMotor motorElectrico() {
        return new NuevoMotor("eléctrico");
    }
}

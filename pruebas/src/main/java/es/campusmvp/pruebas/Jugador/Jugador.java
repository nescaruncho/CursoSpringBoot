package es.campusmvp.pruebas.Jugador;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Jugador {

    @Size(min = 4, max = 12, message = "El nombre debe contener entre 4 y 12 caracteres")
    @Pattern(regexp = "^[a-zA-Z0-9]+$")
    private String nombre;

    @Min(value = 0, message = "El número de victorias debe ser mínimo 0")
    private int victorias;

    @Min(value = 0, message = "El número de derrotas debe ser mínimo 0")
    private int derrotas;

    private double porcentajeVictorias;

    private String tipoJugador;

    public Jugador() {
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.victorias = victorias;
        this.derrotas = derrotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setPorcentajeVictorias(double porcentajeVictorias) {


    }

    public double getPorcentajeVictorias() {
        double porcentaje;

        if (victorias == 0 && derrotas == 0) {
            porcentaje = 0;
        }
        porcentaje = (double) victorias / (victorias + derrotas) * 100;

        porcentajeVictorias = Math.round(porcentaje * 100.0) / 100.0;
        return porcentajeVictorias;
    }

    public String getTipoJugador() {
        double porcentaje = getPorcentajeVictorias();
        if (porcentaje < 50) {
            tipoJugador = "PERDEDOR";
        } else if (porcentaje == 100){
            tipoJugador = "INVENCIBLE";
        } else {
            tipoJugador = "GANADOR";
        }

        return tipoJugador;
    }
}
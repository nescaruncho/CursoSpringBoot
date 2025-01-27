package es.campusmvp.pruebas.Jugador;

public class Jugador {

    private String nombre;
    private int victorias;
    private int derrotas;
    private double porcentajeVictorias;

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

    public double getPorcentajeVictorias() {

        if (victorias == 0 && derrotas == 0) {
            return 0;
        }
        double porcentaje = (double) victorias / (victorias + derrotas) * 100;

        return Math.round(porcentaje * 100.0) / 100.0;
    }

}
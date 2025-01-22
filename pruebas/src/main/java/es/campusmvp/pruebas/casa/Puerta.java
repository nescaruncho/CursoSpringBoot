package es.campusmvp.pruebas.casa;

public class Puerta {

    private final String tipo;

    public Puerta(String tipo){
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Puerta{"+
                "tipo='"+tipo+"'"+
                ", hashCode="+hashCode()+
                '}';
    }
}

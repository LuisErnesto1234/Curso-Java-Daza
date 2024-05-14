package proyecto;

import java.util.ArrayList;

public class AeropuertoPublico extends Aeropuerto{
    private double subvencion;


    public AeropuertoPublico(String ciudad, String nombre, String pais) {
        super(ciudad, nombre, pais);
    }

    public AeropuertoPublico(String ciudad, ArrayList<Compannia> listaCompannia, String nombre, String pais, double subvencion) {
        super(ciudad, listaCompannia, nombre, pais);
        this.subvencion = subvencion;
    }

    public AeropuertoPublico(String ciudad, String nombre, String pais, double subvencion){
        super(ciudad, nombre, pais);
        this.subvencion = subvencion;
    }

    public double getSubvencion() {
        return subvencion;
    }
}

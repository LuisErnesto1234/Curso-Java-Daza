package proyecto;

import java.util.ArrayList;

public class Compannia {

    private String nombre;
    private ArrayList<Vuelo> listaVuelos = new ArrayList<>();
    private Vuelo vue;
    private int numVuelos = 0;

    public Compannia(String nombre) {
        this.nombre = nombre;
    }

    public Compannia(Vuelo vue, String nombre) {
        this.vue = vue;
        this.nombre = nombre;
    }

    public void insertarVuelo(Vuelo vuelo){
        listaVuelos.add(vuelo);
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumVuelos() {
        return numVuelos;
    }

    public Vuelo getVuelo(String id){

        Vuelo vue = null;

        for (Vuelo v : listaVuelos){
            if (nombre.equals(v.getIdentificador_vuelo())){
                vue = v;
                break;
            }
        }

        return vue;
    }
}
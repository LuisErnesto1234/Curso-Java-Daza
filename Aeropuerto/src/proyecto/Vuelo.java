package proyecto;

import java.util.ArrayList;

public class Vuelo {
    private String identificador_vuelo;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precioVuelo;
    private int numMaxPasajero;
    private ArrayList<Pasajero> listaPasajero;
    private int numActualPasajero;

    public Vuelo(String ciudadDestino, String ciudadOrigen, String identificador_vuelo, int numMaxPasajero, double precioVuelo) {
        this.ciudadDestino = ciudadDestino;
        this.ciudadOrigen = ciudadOrigen;
        this.identificador_vuelo = identificador_vuelo;
        this.numMaxPasajero = numMaxPasajero;
        this.precioVuelo = precioVuelo;
        this.numActualPasajero = 0; // Al principio, el vuelo no tiene pasajeros
        this.listaPasajero = new ArrayList<>(); // Inicializar la lista de pasajeros
    }

    public void insertarPasajero(Pasajero pasajero) {
        listaPasajero.add(pasajero);
        numActualPasajero++; // Incrementar el número de pasajeros actuales
    }

    // Métodos getter para acceder a los atributos del vuelo

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public int getNumActualPasajero() {
        return numActualPasajero;
    }

    public String getIdentificador_vuelo() {
        return identificador_vuelo;
    }

    public int getNumMaxPasajero() {
        return numMaxPasajero;
    }

    public double getPrecioVuelo() {
        return precioVuelo;
    }

    // Método para obtener la lista de pasajeros
    public ArrayList<Pasajero> getListaPasajero() {
        return listaPasajero;
    }

    // Método para obtener un pasajero por su pasaporte
    public Pasajero getPasajero(String pasaporte) {
        Pasajero pas = null;
        for (Pasajero p : listaPasajero) {
            if (pasaporte.equals(p.getPasaporte())) {
                pas = p;
                break;
            }
        }
        return pas;
    }
}

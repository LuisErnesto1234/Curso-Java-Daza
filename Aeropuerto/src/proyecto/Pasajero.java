package proyecto;

public class Pasajero {

    private String nombre;
    private String pasaporte;
    private String nacionalidad;

    public Pasajero(String nombre, String pasaporte, String nacionalidad) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getPasaporte() {
        return pasaporte;
    }
}

package Pokemon;

public class Entrenador {
    private int idEntrenador;
    private String nombre;

    public Entrenador(int idEntrenador, String nombre) {
        this.idEntrenador = idEntrenador;
        this.nombre = nombre;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public String mostrarEntrenador() {
        return "Entrenador: " + this.nombre;
    }
}

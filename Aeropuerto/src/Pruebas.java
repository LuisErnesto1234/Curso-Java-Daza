import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {
        Persona p1 = new Persona("Luis");
        System.out.println("Persona 1: " + p1.getNombre());

        Persona p2 = p1;
        System.out.println("Persona 2: " + p2.getNombre());
        p1 = null;
        if (p1 != null)
            System.out.println("Persona 1: " + p1.getNombre());

        else
            System.out.println("El valor es null");

        p2 = null;
        System.gc();
    }
}

class Persona{
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


}

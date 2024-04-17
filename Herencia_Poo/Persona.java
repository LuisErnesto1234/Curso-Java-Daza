package Herencia_Poo;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
    }

    //METODOS GETTER

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }


}

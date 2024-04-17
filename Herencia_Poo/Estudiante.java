package Herencia_Poo;

public class Estudiante extends Persona{

    private int codigoEstudiante;
    private float notaFinal;

    public Estudiante(String nombre, String apellidos, int edad, int codigoEstudiante, float notaFinal){
        super(nombre, apellidos, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre() + "\nApellido: " + getApellido() + "\nEdad: " + getEdad() + "\nCodigo Estudiante: " + codigoEstudiante + "\nNota Final: " + notaFinal);
    }


}

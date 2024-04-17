package Atletas;

/*Ejercicio 4: Construir un programa para una competencia de atletismo, el programa debe gestionar una
serie de atletas caracterizados por su numero de atleta, nombre, tiempo de carrera, al final el
programa debe mostrar los datos del atleta ganador de la carrera.*/

public class Atleta {
    //Atributos
    int numeroAtleta;
    String nombre;
    float tiempoCarrera;

    public Atleta(int numeroAtleta, String nombre, float tiempoCarrera) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    public float getTiempoCarrera() {
        return tiempoCarrera;
    }

    public String MostrarDatos(){

        return "El numero del atleta es: " + numeroAtleta + "\nEl nombre del atleta es: " + nombre + "\n El tiempo de carrera es: " + tiempoCarrera;
    }
}

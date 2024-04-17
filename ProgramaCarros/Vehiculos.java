package ProgramaCarros;

/*Ejercicio 3: Construir un programa que dada una serie de vehiculos caracterizados
* por su marca, modelo y precio, imprima las propiedades del vehiculo mas barato.
* Para ello, se deberan leer por teclado las caracteristicas de cada vehiculo y crear una
* clase que represente a cada uno de ellos*/

public class Vehiculos {
    //Atributos
    private String marca;
    private String modelo;
    private float precio;

    //Metodos

    //Metodo Constructor


    public Vehiculos(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    //Metodo GetPrecio para obtener el precio

    public float getPrecio() {
        return precio;
    }

    public String mostrarDatos(){
        return "La marca es:" + marca + "\nEl modelo es: " + modelo + "\nEl precio es: " + precio;
    }
}

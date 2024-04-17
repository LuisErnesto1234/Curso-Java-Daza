package Tablero;
/*Ejercicio 3: Construir un programa que dada una serie de vehículos caracterizados
por su marca, modelo y precio, imprima las propiedades del vehículo más barato.
Para ello, se deberán leer por teclado las características de cada vehículo y
crear una clase que represente a cada uno de ellos.*/
public class Tablero {
    //Atributos
    private String marca;
    private String modelo;
    private float precio;

    //Constructor
    public Tablero(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    //Metodo GetPrecio para obtener el precio
    public float getPrecio() {
        return precio;
    }

    //Metodo GetMarca para obtener la marca
    public String getMarca() {
        return marca;
    }

    //Metodo GetModelo para obtener el modelo
    public String getModelo() {
        return modelo;
    }

    public String mostrarDatos(){
        return "La marca es:" + marca + "\nEl modelo es: " + modelo + "\nEl precio es: " + precio;
    }

}

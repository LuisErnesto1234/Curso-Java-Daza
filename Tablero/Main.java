package Tablero;

import java.util.Scanner;

/*Ejercicio 3: Construir un programa que dada una serie de vehículos caracterizados
por su marca, modelo y precio, imprima las propiedades del vehículo más barato.
Para ello, se deberán leer por teclado las características de cada vehículo y
crear una clase que represente a cada uno de ellos.*/
public class Main {
    public static int carroBarato(Tablero vehiculos[]){
        float precio;
        int indice = 0;
        precio = vehiculos[0].getPrecio();

        for (int i = 0; i < vehiculos.length; i++) {
            if(vehiculos[i].getPrecio() < precio){
                indice = i;
                precio = vehiculos[i].getPrecio();
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String marca;
        String modelo;
        float precio;
        int numeroCarros, indiceCocheBarato;
        Tablero carros [];

        System.out.print("Cuantos carros desea ingresar: ");
        numeroCarros = sc.nextInt();
        carros = new Tablero[numeroCarros];
        for (int i = 0; i < carros.length; i++) {
            sc.nextLine();
            System.out.print("Ingrese el modelo del auto (" + (i+1) + "): ");
            modelo = sc.nextLine();
            System.out.print("Ingrese la marca del auto (" + (i+1) + "): ");
            marca = sc.nextLine();
            System.out.print("Ingres el precio del auto (" + (i+1) + "): ");
            precio = sc.nextFloat();

            carros[i] = new Tablero(marca, modelo, precio);
        }

        //Buscar el auto barato
        indiceCocheBarato = carroBarato(carros);
        System.out.println("El auto mas barato es: \n" + carros[indiceCocheBarato].mostrarDatos());


    }


}

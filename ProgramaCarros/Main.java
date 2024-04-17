package ProgramaCarros;

/*Ejercicio 3: Construir un programa que dada una serie de vehiculos caracterizados
 * por su marca, modelo y precio, imprima las propiedades del vehiculo mas barato.
 * Para ello, se deberan leer por teclado las caracteristicas de cada vehiculo y crear una
 * clase que represente a cada uno de ellos*/

import java.util.Scanner;

public class Main {
    //Metodo para hallar el vehiculo mas barato segun su precio
    //Este metodo estatico nos permite usarlo sin la nesecidad de instaciarlo por medio de un objeto
    public static int IndiceDCoche (Vehiculos []coches ){
        //Le pasamos el precio
        float precio;
        //Creamos un indice donde vamos a almacenar el indice que halle el programa
        int indice = 0;

        precio = coches[0].getPrecio();

        for (int i = 0; i < coches.length; i++) {
            if (coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String marca, modelo;
        float precio;
        int numeroVehiculos, indiceCocheBarato;

        System.out.println("Ingres el numero de vehiculos a ingresar: ");
        numeroVehiculos = sc.nextInt();

        Vehiculos [] coches = new Vehiculos[numeroVehiculos];//Creo un arreglo a partir de la clase coches
        for (int i = 0; i < numeroVehiculos; i++) {
            sc.nextLine();
            System.out.println("Coche N° : " + (i + 1));
            System.out.println("Ingrese la marca: ");
            marca = sc.nextLine();
            System.out.println("Ingrese el modelo: ");
            modelo = sc.nextLine();
            System.out.println("Ingrese el precio: ");
            precio = sc.nextFloat();

            coches[i] = new Vehiculos(marca, modelo, precio);//Guardo en el arreglo todos los datos
            //del metodo constructor aqui los envio como argumentos pues estos fueron
            //declarados en la clase Vehiculos como parametros
        }

        indiceCocheBarato = IndiceDCoche(coches);
        System.out.println("El coche mas barato es: ");
        System.out.println(coches[indiceCocheBarato].mostrarDatos());


    }
}

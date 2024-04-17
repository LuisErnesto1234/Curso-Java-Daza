package Atletas;

import java.util.Scanner;

/*Ejercicio 4: Construir un programa para una competencia de atletismo, el programa debe gestionar una
serie de atletas caracterizados por su numero de atleta, nombre, tiempo de carrera, al final el
programa debe mostrar los datos del atleta ganador de la carrera.*/
public class Main {

    //Metodo estatico que nos va ayudar a hallar el tiempo menor de los atletas
    public static int Ganador(Atleta []deportistas){
        int indice = 0;
        float tiempoCarrera  = deportistas[0].getTiempoCarrera();

        for (int i = 0; i < deportistas.length; i++) {
            if (deportistas[i].getTiempoCarrera() < tiempoCarrera){
                tiempoCarrera = deportistas[i].getTiempoCarrera();
                indice = i;
            }
        }

        return indice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroDelAtleta;
        String nombre;
        float tiempoCarrera;
        int nAtletas, indiceAtleta;

        System.out.println("Ingrese el numero de atletas a ingresar: ");
        nAtletas = sc.nextInt();

        //Cremos el arreglo a partir de la clase Atleta
        Atleta [] deportistas = new Atleta[nAtletas];

        for (int i = 0; i < deportistas.length; i++) {
            System.out.println("Ingreso de datos");
            System.out.print("Ingrese el numero del atleta: ");
            numeroDelAtleta = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese el nombre del atleta: ");
            nombre = sc.nextLine();
            System.out.println("Ingrese el tiempo del atleta: ");
            tiempoCarrera = sc.nextFloat();

            deportistas[i] = new Atleta(numeroDelAtleta, nombre, tiempoCarrera);
        }

        indiceAtleta = Ganador(deportistas);
        System.out.println("El ganador es: ");
        System.out.println(deportistas[indiceAtleta].MostrarDatos());
    }
}

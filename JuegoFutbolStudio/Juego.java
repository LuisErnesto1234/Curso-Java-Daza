package JuegoFutbolStudio;

import java.util.Scanner;

public class Juego {

    /*enum Talla{MINI,GRANDE,MEDIA,CHICA}*/
    /*enum Talla {

        MINI("S"), MEDIANO("M"), GRANDE("L");

        private String abreviatura;

        Talla(String abreviatura) {
            this.abreviatura = abreviatura;
        }

        public String getAbreviatura() {
            return abreviatura;
        }

    }*/

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        resultado();
    }

    static void resultado() {
        int eleccion;
        int puntos = 0;
        int contador = 1;
        int general;

        do {
            System.out.println("...:::Menu:::...");
            System.out.println("1. Rojo 🟥");
            System.out.println("2. Azul 🟦");
            System.out.println("3. Empate 🟨");
            System.out.print("Ingrese su eleccion: ");
            eleccion = sc.nextInt();

            general = generador();
            if (eleccion == general) {
                System.out.println("Usted gana 10 puntasos 🐔🥱");
                puntos += 10;
            }
            else {
                System.out.println("Usted se equivoco 😹🤯");
                System.out.println("La respuesta correcta era: " + general);
            }

            contador++;

        } while (contador <= 5);

        System.out.println("Ustes hizo " + puntos + " puntos 🥑🥑");
    }

    static int generador() {
        int aleatorio;
        int caso_real = 0;

        for (int i = 1; i <= 5; i++){
            aleatorio = (int) (Math.random() * 30) + 1;
            if (aleatorio >= 1 && aleatorio <= 10) {
                caso_real = 1;
            }
            if (aleatorio >= 11 && aleatorio <= 20) {
                caso_real = 2;
            }
            if (aleatorio >= 21 && aleatorio <= 30) {
                caso_real = 3;
            }
        }

        return caso_real;
    }
}
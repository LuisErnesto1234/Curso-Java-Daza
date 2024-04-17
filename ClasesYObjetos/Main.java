package ClasesYObjetos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tablero tablero = new Tablero(3);

        tablero.inicializarObjeto();
        System.out.println("¡Bienvenido al programa de movimiento en el tablero!");
        tablero.mostrarTablero();

        char movimiento;
        boolean continuar = true;

        do {
            // Mostrar coordenadas actuales
            tablero.mostrarCoordenadas();

            // Solicitar movimiento al usuario
            System.out.println("Elija una dirección de movimiento:");
            System.out.println("W - Arriba");
            System.out.println("S - Abajo");
            System.out.println("A - Izquierda");
            System.out.println("D - Derecha");
            System.out.println("E - Salir");

            // Leer la opción del usuario
            movimiento = sc.next().charAt(0);
            movimiento = Character.toUpperCase(movimiento); // Convertir a mayúscula por si el usuario ingresó minúscula

            // Realizar el movimiento en el tablero
            switch (movimiento) {
                case 'W':
                    tablero.moverArriba();
                    tablero.mostrarTablero();
                    break;
                case 'S':
                    tablero.moverAbajo();
                    tablero.mostrarTablero();
                    break;
                case 'A':
                    tablero.moverIzquierda();
                    tablero.mostrarTablero();
                    break;
                case 'D':
                    tablero.moverDerecha();
                    tablero.mostrarTablero();
                    break;
                case 'E':
                    System.out.println("¡Hasta luego!");
                    continuar = false;
                    break;
                default:
                    System.out.println("¡Movimiento no válido!");
            }

        } while (continuar);

        sc.close();

    }
}

package NumerosComplejos;

import java.util.Scanner;

public class Complejos {
    //Calculadora
    //Atributos
    Scanner sc = new Scanner(System.in);
    private double num1;

    //Suma
    public double Suma(double nNumeros){
        double suma = 0;

        for (int i = 0; i < nNumeros; i++) {
            System.out.print("Ingrese el numero(" + (i+1) + "): ");
            num1 = sc.nextDouble();
            suma += num1;//Chancando el dato Suma Iterativa
        }
        return suma;

    }

    public double Resta(int nNumeros){
        double resta = 0;
        char opciones;
        boolean continuar = false;

        for (int i = 0; i < nNumeros; i++) {
            System.out.print("Ingrese el numero(" + (i+1) + "): ");
            num1 = sc.nextDouble();
            resta -= num1;
            if (resta <= 0){
                do {
                    System.out.println("Desea restar mas numeros el resultado es: " + resta + " actualmente.");
                    System.out.print("Eleccion: (s)(n): ");
                    opciones = sc.next().charAt(0);
                    if (opciones == 's'){
                        continuar = true;

                    } else if (opciones == 'n') {
                        continuar = false;
                    }
                }while (continuar);
            }
        }

        return resta;
    }

    public double Multi(int nNumeros){
        double multiplicacion = 1;

        for (int i = 0; i < nNumeros; i++) {
            System.out.print("Ingrese el numero(" + (i+1) + "): ");
            num1 = sc.nextDouble();
            multiplicacion *= num1;
        }

        return multiplicacion;
    }

    public double Divicion(int nNumeros){
        double divicion = 1;

        for (int i = 0; i < nNumeros; i++) {
            System.out.print("Ingrese el numero(" + (i+1) + "): ");
            num1 = sc.nextDouble();
            divicion /= num1;
        }

        return divicion;
    }
}

package Lados;

import java.util.Scanner;

/*Ejercicio 1: Construir un programa que calcule el área y el perímetro de un cuadrilátero dada
la longitud de sus dos lados. Los valores de la longitud deberán introducirse por línea de ordenes.
Si es un cuadrado, sólo se proporcionará la longitud de uno de los lados al constructor.*/

public class Main {
    public static void main(String[] args) {
        float lado1, lado2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la altura de su cuadrilatero: ");
        lado1 = sc.nextFloat();
        System.out.print("Ingrese la base de cuadrilatero: ");
        lado2 = sc.nextFloat();

        if (lado1 != lado2){
            Cuadrilatero cd = new Cuadrilatero(lado1, lado2);
            System.out.println("El perimetro es: " + cd.Perimetro());
            System.out.println("El área es: " + cd.Area());
        }
        else{
            Cuadrilatero cd = new Cuadrilatero(lado1);
            System.out.println("El perimetro es: " + cd.Perimetro());
            System.out.println("El area es: " + cd.Area());
        }
    }
}

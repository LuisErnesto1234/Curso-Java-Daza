package TriangulosIsosceles;
/*Ejercicio 5: Diseñar un programa para trabajar con triángulos isósceles.
Para ello defina los atributos necesarios que se requieren, proporcione
métodos de consulta, un método constructor e implemente métodos para
calcular el perímetro y el área de un triángulo, además implementar un
método que a partir de un arreglo de triángulos devuelva el área del
triángulo de mayor superficie.*/

import java.util.Scanner;

public class Main {
    public static float mayorArea(Triangulo []t){
        float area;
        area = t[0].Area();
        for (int i = 0; i < t.length; i++) {
            if(t[i].Area() > area){
                area = t[i].Area();
            }
        }
        return area;
    }

    public static void main(String[] args) {
        float altura;
        float base;
        int numeroTriangulos;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cuantos tringulos desea ingresar: ");
        numeroTriangulos = sc.nextInt();

        Triangulo []triangulo = new Triangulo[numeroTriangulos];

        for (int i = 0; i < triangulo.length; i++) {
            System.out.print("\nIngrese la base del triangulo: ");
            base = sc.nextFloat();
            System.out.print("Ingrese la altura del triangulo: ");
            altura = sc.nextFloat();

            triangulo[i] = new Triangulo(base, altura);

            System.out.println("El area es: " + triangulo[i].Area());
            System.out.println("El perimetro es: " + triangulo[i].Perimetro());
        }

        System.out.print("El triangulo de mayor area es: " + mayorArea(triangulo));
    }


}

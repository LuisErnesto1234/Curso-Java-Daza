package Lados;
/*Ejercicio 1: Construir un programa que calcule el área y el perímetro de un cuadrilátero dada
la longitud de sus dos lados. Los valores de la longitud deberán introducirse por línea de ordenes.
Si es un cuadrado, sólo se proporcionará la longitud de uno de los lados al constructor.*/
public class Cuadrilatero {
    private float lado1;
    private float lado2;

    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrilatero(float lado1){
        this.lado1 = this.lado2 = lado1;
    }

    public float Area(){
        float area = 1;
        area = lado1 * lado2;
        return area;
    }

    public float Perimetro(){
        float perimetro = 0;
        perimetro = (lado1 * 2) + (lado2 * 2);
        return perimetro;
    }
}

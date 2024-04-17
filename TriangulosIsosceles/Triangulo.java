package TriangulosIsosceles;
/*Ejercicio 5: Diseñar un programa para trabajar con triángulos isósceles.
Para ello defina los atributos necesarios que se requieren, proporcione
métodos de consulta, un método constructor e implemente métodos para
calcular el perímetro y el área de un triángulo, además implementar un
método que a partir de un arreglo de triángulos devuelva el área del
triángulo de mayor superficie.*/
public class Triangulo {
    //Atributos
    private float base;
    private float altura;

    //Metodos


    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    //Metodo que halla el perimetro
    public float Area() {
        float area;
        area = (altura * base) / 2;
        return area;
    }

    public float Perimetro(){
        float perimetro;
        perimetro = (altura * 2) + base;
        return perimetro;
    }


}


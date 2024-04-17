package NumerosComplejos;
/*A implementar HOY DIA
* Todas las operaciones se realizan infinitamente hasta que el usuario lo diga
* La resta tiene como opcion de restar hasta que el resultado sea cero o no
* */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nNumeros, op;
        double respaldo;
        char continuarLetra;
        boolean continuarMasNum = false;

        System.out.println("***************************");
        System.out.println("*** Ingrese una opcion ****");
        System.out.println("1- Suma *******************");
        System.out.println("2- Resta ******************");
        System.out.println("3- Multiplicacion *********");
        System.out.println("4- Divicion ***************");
        System.out.println("5- Salir ******************");
        System.out.println("***************************");

        System.out.print("Ingrese su eleccion: ");
        op = sc.nextInt();
        Complejos nm = new Complejos();
        switch (op){
            case 1:
                System.out.println("Bienvenido a Suma");
                System.out.println("Cuantos numero desea sumar");
                nNumeros = sc.nextInt();
                System.out.println("La suma de los numero es: " + nm.Suma(nNumeros));
                do {
                    System.out.println("Desea sumar mas numeros: (s)(n)");
                    continuarLetra = sc.next().charAt(0);
                    if (continuarLetra == 's') {
                        continuarMasNum = true;
                        respaldo = nm.Suma(nNumeros);
                        System.out.println("Cuantos numeros mas desea sumar: ");
                        nNumeros = sc.nextInt();
                        System.out.println("El resultado de la suma actual es: " + respaldo);
                        System.out.println("La suma de los numero es: " + (nm.Suma(nNumeros) + respaldo));
                    } else if (continuarLetra == 'n') {
                        System.out.println("Adios :)");
                        continuarMasNum = false;
                    } else {
                        continuarMasNum = true;
                        System.out.println("Caracter no valido!!");
                        System.out.println("Desea sumar mas numeros: (s)(n)");
                        continuarLetra = sc.next().charAt(0);
                    }
                }while (continuarMasNum);
                break;
            case 2:
                System.out.println("Bienvenido a Resta");
                System.out.print("Cuantos numero desea restar: ");
                nNumeros = sc.nextInt();
                System.out.println("La resta de los numeros es: " + nm.Resta(nNumeros));

                break;
            case 3:
                System.out.println("Bienvenido a Multiplicacion");
                System.out.print("Cuantos numero desea Multiplicar: ");
                nNumeros = sc.nextInt();
                System.out.println("La multiplicacion de los numeros es: " + nm.Multi(nNumeros));
                break;
            case 4:
                System.out.println("Bienvenido a Divicion");
                System.out.print("Cuantos numero desea divicion: ");
                nNumeros = sc.nextInt();
                System.out.println("La resta de los numeros es: " + nm.Divicion(nNumeros));
                break;
            default:
                System.out.println("Eso no fue lo que yo ordene :)");
                break;
        }
    }
}

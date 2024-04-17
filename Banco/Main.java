package Banco;

/*Ejercicio 7: Hacer un programa sencillo para realizar gestiones en un banco para lo cual
 * tendremos 2 clases (Cliente y Cuenta). Considerar que un cliente se carateriza, por su nombre,
 * apellido y DNI. El cliente puede consultar saldo, asi como ingresar y retirar dinero de sus cuentas.
 * Ademas cada cuenta se carateriza por un numero de cuenta y un saldo.*/

import java.util.Scanner;

public class Main {
    public static int buscarCuenta(Cuenta[] cuenta, int n) {
        int i = 0;
        int indice = 0;
        boolean encontrado = false;
        while (i < cuenta.length && !encontrado) {
            if (cuenta[i].getNumeroCuenta() == n) {
                indice = i;
                encontrado = true;
            }
            i++;
        }

        if (!encontrado) {
            indice = -1;
        }

        return indice;
    }

    //Metodo estatico de busqueda
    public static void main(String[] args) {
        String nombre, apellido, dni;
        int numeroCuenta, op, cantidadCuentas, busquedaCuenta;
        double saldo, cantidad, actual;
        Cuenta[] cuentas;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el apellido: ");
        apellido = sc.nextLine();
        System.out.print("Ingrese el DNI: ");
        dni = sc.nextLine();
        System.out.print("Cuantas cuentas tiene: ");
        cantidadCuentas = sc.nextInt();
        cuentas = new Cuenta[cantidadCuentas];
        Cliente cliente = new Cliente(nombre, apellido, dni, cuentas);

        System.out.println("Cliente registrado");
        System.out.print("\033[H\033[2J");
        System.out.flush();

        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("Ingrese el nuemero de la cuenta: ");
            numeroCuenta = sc.nextInt();
            System.out.println("Ingrese el saldo para la cuenta: ");
            saldo = sc.nextDouble();

            cuentas[i] = new Cuenta(numeroCuenta, saldo);
        }

        do {
            System.out.println("\t ..::Menu::..");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Consultar dinero en la cuenta");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("*******************");

            System.out.print("Ingrese su eleccion: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el numero de cuenta: ");
                    numeroCuenta = sc.nextInt();
                    busquedaCuenta = buscarCuenta(cuentas, numeroCuenta);
                    if (busquedaCuenta == -1) {
                        System.out.println("No existe la cuenta");
                    } else {
                        System.out.println("Ingrese el saldo a ingresar: ");
                        cantidad = sc.nextDouble();
                        cliente.ingresarDinero(busquedaCuenta, cantidad);
                        System.out.println("Ingreso realizado!!");
                        System.out.println("Saldo disponible: " + cliente.consultarSaldo(busquedaCuenta));
                    }
                    break;
                case 2:
                    System.out.println("Ingres el numero de la cuenta: ");
                    numeroCuenta = sc.nextInt();
                    busquedaCuenta = buscarCuenta(cuentas, numeroCuenta);
                    if (busquedaCuenta == -1) {
                        System.out.println("No existe la cuenta");
                    } else {
                        System.out.println("Mostrando cuenta: " + cliente.consultarSaldo(busquedaCuenta));
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el numero de la cuenta: ");
                    numeroCuenta = sc.nextInt();
                    busquedaCuenta = buscarCuenta(cuentas, numeroCuenta);
                    if (busquedaCuenta == -1) {
                        System.out.println("No existe la cuenta");
                    } else {
                        System.out.println("El saldo disponible es: " + cliente.consultarSaldo(busquedaCuenta));
                        System.out.print("Ingrese la cantidad a retirar: ");
                        cantidad = sc.nextDouble();
                        actual = cliente.consultarSaldo(busquedaCuenta);
                        if (cantidad > actual) {
                            System.out.println("Lo siento saldo insufficiente!! 😔😔");
                        } else {
                            cliente.retirarDinero(busquedaCuenta, cantidad);
                            System.out.println("Retiro realizado!!");
                            System.out.println("Saldo disponible: " + cliente.consultarSaldo(busquedaCuenta));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Adios 🐔🐔");
                    break;
                default:
                    System.out.println("Opcion no valida 🤣🤣");
                    break;
            }
        } while (op != 4);
    }
}


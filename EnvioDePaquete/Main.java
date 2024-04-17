package EnvioDePaquete;

import java.util.Scanner;

/*Ejercicio 8: Una empresa de envio de paquetes tiene varias sucursales
 * en todoe el pais. Cada sucursal esta definida por su numero de sucursal,
 * dirección, y ciudad. Para calcular el precio que cuesta enviar cada paquete,
 * las sucursales tienen en cuenta el precio del paquete y la prioridad, sabiendo
 * que se cobra un dolar por kilo, 10 dolares mas si la prioridad es alta y 20 si
 * express. Cada paquete enviado tendra un numero de referencia y el DNI de la persona
 * que lo envia.
 */

public class Main {
    public static int buscarPaquete(Paquete[] t, int numeroPaquete, int contadorPaquete) {
        int indice = 0;
        boolean encontrado = false;
        for (int i = 0; i < contadorPaquete; i++) {
            if (t[i].getNumeroPaquete() == numeroPaquete) {
                encontrado = true;
                indice = i;
            }
        }
        if (!encontrado) {
            indice = -1;
        }
        return indice;
    }

    public static int buscarSucursal(Sucursal []s, int numeroSucursal, int contadorSucursal) {
        int indice = 0;
        boolean encontrado = false;
        for (int i = 0; i < contadorSucursal; i++) {
            if (s[i].getNumeroSucursal() == numeroSucursal) {
                encontrado = true;
                indice = i;
            }
        }
        if (!encontrado) {
            indice = -1;
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroPaquete, prioridad, numeroSucursal, codSucursal;
        String dni, direccion, ciudad;
        float peso;
        int op, indiceSucursal = 0, respuesta, indicePaquete = 0;

        Sucursal[] sucursales = new Sucursal[50];
        Paquete[] paquetes = new Paquete[50];

        do {
            System.out.println("\t ..::MENU::..");
            System.out.println("1. Crear una nueva sucursal");
            System.out.println("2. Enviar Paquete");
            System.out.println("3. Consultar todas las sucursales");
            System.out.println("4. Consultar todos los paquetes");
            System.out.println("5. Consultar Sucursal");
            System.out.println("6. consultar Paquete");
            System.out.println("7. Salir");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Ingrese el codigo de la sucursal: ");
                    numeroSucursal = sc.nextInt();
                    System.out.print("Ingrese la direccion: ");
                    sc.nextLine();
                    direccion = sc.nextLine();
                    System.out.print("Ingrese la ciudad: ");
                    ciudad = sc.nextLine();
                    sucursales[indiceSucursal] = new Sucursal(numeroSucursal, direccion, ciudad);
                    indiceSucursal++;
                    break;
                case 2:
                    System.out.println("Ingrese el codigo de la sucursal: ");
                    codSucursal = sc.nextInt();
                    respuesta = buscarSucursal(sucursales, codSucursal, indiceSucursal);
                    if (respuesta == -1) {
                        System.out.println("La sucursal no existe");
                    } else {
                        System.out.println("Sucursal encontrada: ");
                        System.out.println(sucursales[respuesta].mostrarDatosSucursal());
                        System.out.print("Ingrese el codigo de envio: ");
                        numeroPaquete = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingrese el DNI: ");
                        dni = sc.nextLine();
                        System.out.print("Ingrese la prioridad: (0 - Normal | 1 - Especial | 2 - Express) ");
                        prioridad = sc.nextInt();
                        System.out.print("Ingrese el peso del paquete: ");
                        peso = sc.nextFloat();
                        paquetes[indicePaquete] = new Paquete(numeroPaquete, dni, prioridad, peso);
                        float precio = sucursales[respuesta].calcularPrecio(paquetes[indicePaquete]);
                        System.out.println("Precio paquete: " + precio);

                        indicePaquete++;


                    }
                    break;
                case 3:
                    System.out.println("Muestra de todas las sucursales: ");
                    for (int i = 0; i < indiceSucursal; i++) {
                        System.out.println(sucursales[i].mostrarDatosSucursal());
                    }
                    break;
                case 4:
                    System.out.println("Muestra de todos los paquetes: ");
                    for (int i = 0; i < indicePaquete; i++) {
                        System.out.println(paquetes[i].mostrarDatos());
                    }
                    break;
                case 5:
                    System.out.print("Ingrese el codigo de la sucursal: ");
                    codSucursal = sc.nextInt();
                    respuesta = buscarSucursal(sucursales, codSucursal, indiceSucursal);
                    if (respuesta == -1) {
                        System.out.println("La sucursal no existe");
                    } else {
                        System.out.println(sucursales[respuesta].mostrarDatosSucursal());
                    }
                    break;
                case 6:
                    System.out.print("Ingrese el codigo del paquete: ");
                    numeroPaquete = sc.nextInt();
                    respuesta = buscarPaquete(paquetes, numeroPaquete, indicePaquete);
                    if (respuesta == -1) {
                        System.out.println("El paquete no existe");
                    } else {
                        System.out.println(paquetes[respuesta].mostrarDatos());
                    }
                    break;
                case 7:
                    System.out.println("Adios 😔");
                    break;
                default:
                    System.out.println("Opcion no valida 🥑🥑");
                    break;
            }

        } while (op != 7);

    }

}
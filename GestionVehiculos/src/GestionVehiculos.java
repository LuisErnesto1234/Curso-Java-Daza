import models.*;
import java.util.*;

public class GestionVehiculos {
    static List<VehiculoBase> vehiculos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    int op;

    do {
        System.out.println("\t\t:::MENU::::");
        System.out.println("1. Agregar Vehiculo");
        System.out.println("2. Mostrar Vehiculos");
        System.out.println("3. Salir");

        op = sc.nextInt();

        switch (op){
            case 1:
                agregarVehiculo();
                break;
            case 2:
                mostrarVehiculos();
                break;
            case 3:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }


    }while (op != 3);
    }

    public static void agregarVehiculo(){
        String marca, modelo, tipoMoto;
        int anio, numPuertas;
        TipoCombustible combustible;
        boolean exit = false;
        do {
            System.out.println("¿Que tipo de Vehiculo desea registrar?");
            System.out.println("1. Automovil 🚗");
            System.out.println("2. Motocicleta 🏍️");
            System.out.println("3. Volver atras");
            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.println("Ingrese la marca del automovil: ");
                marca = sc.nextLine();
                System.out.println("Ingrese el modelo del automovil: ");
                modelo = sc.nextLine();
                System.out.println("Ingrese el año del automovil: ");
                anio = sc.nextInt();
                System.out.println("Ingrese el numero de puertas del automovil: ");
                numPuertas = sc.nextInt();
                System.out.println("Ingrese el tipo de combustible del automovil: ");
                System.out.println("1. Gasolina");
                System.out.println("2. Diesel");
                System.out.println("3. Electrico");
                combustible = TipoCombustible.values()[sc.nextInt()];

                VehiculoBase automovil = new Automovil(marca, modelo, anio, combustible, numPuertas);
                vehiculos.add(automovil);
                System.out.println("Vehiculo agregado con exito!!!");

            } else if (op == 2) {
                System.out.println("Ingrese la marca de la moto: ");
                marca = sc.nextLine();
                System.out.println("Ingrese el modelo de la moto: ");
                modelo = sc.nextLine();
                System.out.println("Ingrese el año de la moto: ");
                anio = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese el tipo de la moto: ");
                tipoMoto = sc.nextLine();
                System.out.println("Ingrese el tipo de combustible de la moto: ");
                System.out.println("1. Gasolina");
                System.out.println("2. Diesel");
                System.out.println("3. Electrico");
                combustible = TipoCombustible.values()[sc.nextInt()];

                VehiculoBase moto = new Motocicleta(marca, modelo, anio, combustible, tipoMoto);
                vehiculos.add(moto);
                System.out.println("Motocicleta registrada con exito!!!");
            } else if (op == 3) {
                exit = true;
            }
            else {
                System.out.println("Ingreso no valido");
            }
        }while (!exit);
    }
    public static void mostrarVehiculos(){
        for (VehiculoBase vehiculo : vehiculos) {
            System.out.println(vehiculo.ObtenerDetalles());
        }
    }
}
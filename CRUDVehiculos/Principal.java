package ProyectoVehiculos;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    static int op;
    static Scanner sc = new Scanner(System.in);
    static String marca;
    static String modelo;
    static int annioFabricacion;
    static double precio;

    public static void main(String[] args) {


        do {
            System.out.println("...::::::::Menu::::::::....");
            System.out.println("1. Registrar Vehiculo");
            System.out.println("2. Buscar Vehiculo");
            System.out.println("3. Eliminar Vehiculo");
            System.out.println("4. Modificar Vehiculo");
            System.out.println("5. Salir");
            System.out.print("Ingrese su eleccion: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    registrarVehiculo();
                    break;
                case 2:
                    buscarVehiculo();
                    break;
                case 3:
                    eliminarVehiculos();
                    break;
                case 4:
                    modificarVehiculo();
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa 😎");
                    break;
                default:
                    System.out.println("Invalido");
                    break;
            }

        }while (op != 5);
    }

    static public void registrarVehiculo(){
        boolean salir = false;

        while (!salir) {

            System.out.println("...::::::::Menu::::::::....");
            System.out.println("1. Registrar Coche 🚗");
            System.out.println("2. Registrar Motocicleta 🏍️");
            System.out.println("3. Registrar Camion 🛻");
            System.out.println("4. Volver atras");
            System.out.print("Ingrese su eleccion: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    registrarCoche();
                    break;
                case 2:
                    registrarMotocicleta();
                    break;
                case 3:
                    registrarCamion();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Invalido");
                    break;
            }
        }
    }
    static public void registrarCoche(){
    int numeroAsientos;
    int numeroPuertas;
    System.out.println("Bienvenido, registrar tu coche");
    System.out.print("Ingresa la marca: ");
    marca = sc.next();
    System.out.print("Ingresa el modelo: ");
    modelo = sc.next();
    System.out.print("Ingrese el año de fabricacion: ");
    annioFabricacion = sc.nextInt();
    System.out.print("Ingrese el precio: ");
    precio = sc.nextDouble();
    System.out.print("Ingrese el numero de puertas: ");
    numeroPuertas = sc.nextInt();
    System.out.println("Ingrese el numero de asientos: ");
    numeroAsientos = sc.nextInt();

    Vehiculo coche = new Coche(marca, modelo, annioFabricacion, precio, numeroAsientos, numeroPuertas);
    vehiculos.add(coche);

    System.out.println("El coche fue registrado con exito 🥳🥳");

}
    static public void registrarMotocicleta(){

    System.out.println("Bienvenido, registrar tu Motocicleta");
    System.out.print("Ingresa la marca: ");
    marca = sc.next();
    System.out.print("Ingresa el modelo: ");
    modelo = sc.next();
    System.out.print("Ingrese el año de fabricacion: ");
    annioFabricacion = sc.nextInt();
    System.out.print("Ingrese el precio: ");
    precio = sc.nextDouble();
    System.out.print("Ingrese el tipo de motor: ");
    String tipo_motor = sc.next();

    Vehiculo motocicleta = new Motocicleta(marca, modelo, annioFabricacion, precio, tipo_motor);
    vehiculos.add(motocicleta);
    System.out.println("La motocicleta fue registrada con exito 🥳🥳");
}
    static public void registrarCamion(){

    System.out.println("Bienvenido, registrar tu Camion");
    System.out.print("Ingresa la marca: ");
    marca = sc.next();
    System.out.print("Ingresa el modelo: ");
    modelo = sc.next();
    System.out.print("Ingrese el año de fabricacion: ");
    annioFabricacion = sc.nextInt();
    System.out.print("Ingrese el precio: ");
    precio = sc.nextDouble();
    System.out.print("Ingrese la carga: ");
    double carga = sc.nextDouble();

    Vehiculo camion = new Camion(marca, modelo, annioFabricacion, precio, carga);
    vehiculos.add(camion);
    System.out.println("El camion fue registrado con exito 🥳🥳");
    }
    static public void buscarVehiculo(){
        System.out.println("Bienvenido a Buscar vehiculo 🔍🕵️");
        System.out.print("Ingrese el modelo del vehiculo: ");
        modelo = sc.next();

        for (Vehiculo v : vehiculos){
            if (modelo.equals(v.getModelo())){
                System.out.println(v.toString());
            }
            else {
                System.out.println("No existe ese modelo de vehiculo registrado");
            }
        }
    }
    static public void eliminarVehiculos(){
        char opcion;
        System.out.println("Bienvenido a Eliminar vehiculo 🔍🕵️");
        System.out.print("Ingrese el modelo del vehiculo: ");
        modelo = sc.next();

        for (Vehiculo v : vehiculos){
            if (modelo.equals(v.getModelo())){
                System.out.println("El vehiculo a eliminar es: ");
                System.out.println(v.toString());
                System.out.print("Es esto correcto (s | n): ");
                opcion = sc.next().charAt(0);
                if (opcion =='s'){
                    vehiculos.remove(v);
                    System.out.println("El vehiculo fue eliminado con exito 🥳🥳");
                    break;
                }
                else {
                    System.out.println("El vehiculo no fue eliminado");
                    break;
                }
            }
            else {
                System.out.println("No existe ese modelo de vehiculo registrado");
                break;
            }
        }
    }
    static public void modificarVehiculo(){
        char opcion;
        System.out.println("Bienvenido a Modificar el vehiculo 🔍🕵️");
        System.out.print("Ingrese el modelo del vehiculo: ");
        modelo = sc.next();

        for (Vehiculo v : vehiculos){
            if (modelo.equals(v.getModelo())){
                System.out.println("El vehiculo a modificar es: ");
                System.out.println(v.toString());
                System.out.print("Es esto correcto (s | n): ");
                opcion = sc.next().charAt(0);
                if (opcion =='s'){
                    vehiculos.remove(v);
                    if (v instanceof Coche){
                        registrarCoche();
                        System.out.println("El coche se modifico con exito");
                        break;
                    }
                    if (v instanceof Motocicleta) {
                        registrarMotocicleta();
                        System.out.println("La moticicleta se modifico con exito");
                        break;
                    }
                    if (v instanceof Camion) {
                        registrarCamion();
                        System.out.println("El camion se modifico con exito");
                        break;
                    }
                    break;
                }
                else {
                    System.out.println("El vehiculo no fue modificado");
                    break;
                }
            }
            else {
                System.out.println("No existe ese modelo de vehiculo registrado");
                break;
            }
        }
    }
}




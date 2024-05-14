package proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Pasajero> pasajeros = new ArrayList<>();
    static ArrayList<Vuelo> vuelos = new ArrayList<>();
    static ArrayList<Compannia> compannias = new ArrayList<>();
    public static void main(String[] args) {
        int op;

        do {
            System.out.println("\t:::::MENU::::::");
            System.out.println("1. Registrar Pasajero 😎");
            System.out.println("2. Mostrar Pasajeros 😇");
            System.out.println("3. Registrar Vuelo");
            System.out.println("4. Mostrar Vuelos");
            System.out.println("5. Registrar Pasajeros Vuelo");
            System.out.println("6. Salir");
            System.out.println(":::::::::::::::::");
            System.out.print("Ingrese su eleccion: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    registrarPasajero();
                    break;
                case 2:
                    mostrarPasajeros();
                    break;
                case 3:
                    registrarVuelo();
                    break;
                case 4:
                    mostrarVuelos();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
        }while (op != 5);

    }

    static public void registrarPasajero(){
        System.out.print("Ingrese el nombre: ");
        String nombre = sc.next();
        System.out.print("Ingrese el pasaporte: ");
        String pasaporte = sc.next();
        System.out.print("Ingrese la nacionalidad: ");
        String nacionalidad = sc.next();

        Pasajero p = new Pasajero(nombre, pasaporte, nacionalidad);
        pasajeros.add(p);
    }
    static public void mostrarPasajeros(){
        for (Pasajero p: pasajeros) {
            System.out.println("Pasajeros: " + p.getNombre() + " " + p.getPasaporte() + " " + p.getNacionalidad());
        }
    }
    static public void registrarVuelo() {

        System.out.println("Ingrese el ID del vuelo: ");
        String identificador_vuelo = sc.next();
        System.out.println("Ingrese la ciudad de origen: ");
        String ciudadOrigen = sc.next();
        System.out.println("Ingrese la ciudad de destino: ");
        String ciudadDestino = sc.next();
        System.out.println("Ingrese el precio del vuelo: ");
        double precioVuelo = sc.nextDouble();
        System.out.println("Ingrese el numero maximo de pasajeros: ");
        int numMaxPasajero = sc.nextInt();
        int numActualPasajero = pasajeros.size();

        Vuelo vue = new Vuelo(ciudadDestino, ciudadOrigen, identificador_vuelo, numMaxPasajero, precioVuelo);
        vuelos.add(vue);
    }
    static public void mostrarVuelos(){
        System.out.println("Estos son los vuelos registrados: ");
        for (Vuelo v : vuelos){
            System.out.println("Identificador Vuelo: " + v.getIdentificador_vuelo() +
                    "\nCiudad de origen: " + v.getCiudadOrigen() +
                    "\nCiudad destino: " + v.getCiudadDestino() +
                    "\nPrecio del vuelo: " + v.getPrecioVuelo() +
                    "\nNumero maximo pasajeros: " + v.getNumMaxPasajero());
            System.out.println("Los pasajeros registros son: ");
            for (Pasajero p : v.getListaPasajero()){
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Pasaporte: " + p.getPasaporte());
                System.out.println("Nacionalidad: " + p.getNacionalidad());
                System.out.println("***************************");
            }
            System.out.println("*************************************");
        }
    }
    static public void registrarPasajeroVuelo(){
        String op;
        System.out.println("Ingrese el id del vuelo: 😇");
        String id = sc.next();

        Vuelo vue = null;
        for (Vuelo v : vuelos){
            if (id.equals(v.getIdentificador_vuelo())){
                vue = v;
                break;
            }
        }

        if (vue == null){
            System.out.println("No se encontro el vuelo con el id: " + id);
        }
        else {
            System.out.println("Estos los son los pasajeros disponibles a insertar en el vuelo: ");
            for (Pasajero p : pasajeros){
                System.out.println("*********Pasajero**********");
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Pasaporte: " + p.getPasaporte());
                System.out.println("Nacionalidad: " + p.getNacionalidad());
                System.out.println("***************************");
            }

            System.out.println("Ingrese el pasaporte del pasajero a ingresar: ");
            String pasaporte = sc.next();
            Pasajero p = (Pasajero) buscarPasajero(pasaporte);
            if (p == null){
                System.out.println("No se encontro al pasajero con el pasaporte: " + pasaporte);
            }
            else {
                vue.insertarPasajero(p);
                vuelos.add(vue);
                System.out.println("Pasajero insertado con exito ");
            }

            System.out.println("Desea registrar otro pasajeros (s)(n)");
        }





    }
    static public Object buscarPasajero(String pasaporte) {

        Pasajero pas = null;

        for (Pasajero p : pasajeros){
            if (pasaporte.equals(p.getPasaporte())){
                pas = p;
                break;
            }
        }
        return pas;
    }
    static public void registrarCompannias(){
        String nombre;
        String id;
        String op;
        Vuelo vuelo;
        System.out.println("Ingrese el nombre de la compañia: ");
        nombre = sc.next();
        int numVuelos = vuelos.size();
        System.out.println("El numero actual de vuelos es: " + numVuelos);
        System.out.println("Estos son los vuelos registrados: ");
        for (Vuelo v : vuelos){
            System.out.println("Identificador Vuelo: " + v.getIdentificador_vuelo() +
                    "\nCiudad de origen: " + v.getCiudadOrigen() +
                    "\nCiudad destino: " + v.getCiudadDestino() +
                    "\nPrecio del vuelo: " + v.getPrecioVuelo() +
                    "\nNumero maximo pasajeros: " + v.getNumMaxPasajero());
            System.out.println("*************************************");
        }
        do {
            System.out.println("Ingrese el Identificador del vuelo a registrar dentro de la compannia: ");
            id = sc.next();
            buscarBuelo(id);
            vuelo = (Vuelo) buscarBuelo(id);
            if (vuelo == null) {
                System.out.println("No fue encontrado el vuelo con este ID: " + id);
            } else {
                Compannia company = new Compannia(vuelo, nombre);
                compannias.add(company);
            }

            System.out.println("Desea registrar otro vuelo (s)(n)");
            op = sc.next();

        }while (op.equals("s"));
    }

    static public Object buscarBuelo(String id){

        Vuelo vue = null;

        for (Vuelo v : vuelos){
            if(id.equals(v.getIdentificador_vuelo())){
                vue = v;
                break;
            }
        }
        return vue;
    }

    static public void verCompannias(){

        System.out.println("Mostrando todas las compañias: 🎁");
        for (Compannia c : compannias){
            System.out.println("Nombre de la compañia: " + c.getNombre());
            System.out.println("Vuelos registrados: ");
            for (Vuelo v : vuelos){
                System.out.println();
            }
            System.out.println("**********************");
        }

    }
}

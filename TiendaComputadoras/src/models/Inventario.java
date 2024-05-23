package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventario {
    private List<Teclado> teclados = new ArrayList<>();
    private List<Monitor> monitores = new ArrayList<>();
    private List<Raton> mouse = new ArrayList<>();
    private List<Computadora> computadoras = new ArrayList<>();

    public void registrarTeclado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la marca: ");
        String marca = sc.nextLine();
        System.out.println("Ingrese el tipo de entrada:");
        String tipoEntrada = sc.nextLine();
        Teclado teclado = new Teclado(tipoEntrada, marca);
        teclados.add(teclado);
        System.out.println("Se registro con exito el teclado");
    }

    public void mostrarTeclados() {
        for (Teclado teclado : teclados) {
            System.out.println("ID Teclado: " + teclado.getIdTeclado() +
                    "\nMarca: " + teclado.getMarca() +
                    "\nTipo de entrada: " + teclado.getTipoEntrada() +
                    "\n");
        }
    }

    public void registrarMonitor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la marca del monitor: ");
        String marca = sc.nextLine();
        System.out.println("Ingrese el tamaño del monitor: ");
        double tamannio = sc.nextDouble();
        Monitor monitor = new Monitor(marca, tamannio);
        monitores.add(monitor);
        System.out.println("Monitor registrado con exito!!!");
    }

    public void mostrarDetalles() {
        for (Monitor monitor : monitores) {
            System.out.println("ID monitor: " + monitor.getIdMonitor() +
                    "\nMarca: " + monitor.getMarca() +
                    "\nTamaño: " + monitor.getTamannio() + "\n");
        }
    }

    public void registrarMouse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la marca del mouse: ");
        String marca = sc.nextLine();
        System.out.println("Ingrese el tipo de entrada: ");
        String tipoEntrada = sc.nextLine();
        Raton raton = new Raton(tipoEntrada, marca);
        mouse.add(raton);
        System.out.println("Mouse registrado con exito!!!");
    }

    public void mostrarMouse() {
        for (Raton raton : mouse) {
            System.out.println("ID mouse: " + raton.getIdRaton() +
                    "\nMarca: " + raton.getMarca() +
                    "\nTipo de entrada: " + raton.getTipoEntrada() + "\n");
        }
    }

    public void mostrarInventario() {
        mostrarTeclados();
        mostrarDetalles();
        mostrarMouse();
    }

    public void registrarComputadora() {
        int aux = 0;
        int indiceMonitor;
        int indiceTeclado;
        int indiceMouse;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el monitor a registrar: ");
        for (Monitor monitor : monitores) {
            System.out.println(aux + monitor.getMarca() + "\n" + monitor.getTamannio() + "\n");
            aux++;
        }
        System.out.println("Ingrese su eleccion: ");
        indiceMonitor = sc.nextInt();
        System.out.println("Usted eligio este monitor: " + monitores.get(indiceMonitor));
        System.out.println("Ingrese el teclado a registrar: ");
        for (Teclado teclado : teclados) {
            System.out.println(aux + teclado.getMarca() + "\n" + teclado.getTipoEntrada() + "\n");
            aux++;
        }
        System.out.println("Ingrese su eleccion: ");
        indiceTeclado = sc.nextInt();
        System.out.println("Usted eligio este teclado: " + teclados.get(indiceTeclado));
        System.out.println("Ingrese el Mouse a registrar: ");
        for (Raton raton : mouse) {
            System.out.println(aux + raton.getTipoEntrada() + raton.getMarca());
            aux++;
        }
        System.out.println("Elija el mouse por su indice: ");
        indiceMouse = sc.nextInt();
        System.out.println("Usted eligio este mouse: " + mouse.get(indiceMouse));
        System.out.println("Ingrese el nombre de la computadora: ");
        String nombre = sc.nextLine();
        System.out.println("Pongale un precio a la compu que se acaba de armar 😎: ");
        double precio = sc.nextDouble();
        Computadora computadora = new Computadora(nombre, monitores.get(indiceMouse), teclados.get(indiceMouse), mouse.get(indiceMouse), precio);
        computadoras.add(computadora);
        System.out.println("Computadora registrda!!!!");
    }

    public String mostrarComputadoras() {
        String cadena = "";
        for (Computadora computadora : computadoras) {
            cadena = "ID computadora: " + computadora.getIdComputadora() +
                    "\nNombre: " + computadora.getNombre() +
                    "\nMonitor: " + computadora.getMonitor() +
                    "\nTeclado: " + computadora.getTeclado() +
                    "\nMouse: " + computadora.getRaton() +
                    "\nPrecio: " + computadora.getPrecio() +
                    "\n";
        }
        return cadena;
    }

    public List<Computadora> obtenerComputadoras(){
        return new ArrayList<>(computadoras);
    }
}
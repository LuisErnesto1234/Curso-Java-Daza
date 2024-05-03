package ProyectoVehiculos;

import java.util.Scanner;

public class Coche extends Vehiculo implements Reparacion{
    private int numeroAsientos;
    private int numeroPuertas;

    public Coche(String marca, String modelo, int annioFabricacion, double precio, int numeroAsientos, int numeroPuertas) {
        super(marca, modelo, annioFabricacion, precio);
        this.numeroAsientos = numeroAsientos;
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public void calcularImpuesto() {
        double impuesto = getNumeroAsientos() * 10;

        System.out.println("Bienvenido a calcula tu impuesto.com 😎🚗");
        System.out.println("El impuesto para tu auto es: S/." + impuesto);
    }

    @Override
    public void reparar() {
        Scanner sc = new Scanner(System.in);
        int eleccion;
        System.out.println("Bienvenido a reparar tu auto.com 😎🚗");
        System.out.println("...:::Menu Reparacion:::...");
        System.out.println("1. Llantas (S/. 120) ");
        System.out.println("2. Luces (S/. 50) ***");
        System.out.println("3. Salir");
        System.out.print("Entonces en que puedo ayudarte: ");
        eleccion = sc.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("Usted ha elegido reparar las llantas 🛞");
                System.out.println("Se le ha aplicado una cuota de: S/.120.00");
                break;
            case 2:
                System.out.println("Usted ha elegido reparar las luces 🚦");
                System.out.println("Se le ha aplicado una cuota de: S/.50.00");
                break;
            case 3:
                System.out.println("Usted ha elegido salir ✖️");
                break;
            default:
                System.out.println("Usted ha ingresado una opcion incorrecta 🐔");
                break;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNumero Asientos: " + numeroAsientos +
                "\nNumero de puertas: " + numeroPuertas;
    }
}

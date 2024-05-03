package ProyectoVehiculos;

import java.util.Scanner;

public class Motocicleta extends Vehiculo implements Reparacion{
    private String tipo_motor;

    public Motocicleta(String marca, String modelo, int annioFabricacion, double precio, String tipo_motor) {
        super(marca, modelo, annioFabricacion, precio);
        this.tipo_motor = tipo_motor;
    }

    public String getTipo_motor() {
        return tipo_motor;
    }

    @Override
    public void calcularImpuesto() {
        double porcentaje = getPrecio() / 100;
        double impuesto = getPrecio() * porcentaje;

        System.out.println("Bienvenido a calcula tu impuesto.com 😎🏍️");
        System.out.println("El impuesto de su moto es: S/." + impuesto);
    }

    @Override
    public void reparar() {

        Scanner sc = new Scanner(System.in);
        int eleccion;
        System.out.println("Bienvenido a reparar tu moto.com 😎🏍️");
        System.out.println("...:::Menu Reparacion:::...");
        System.out.println("1. Llantas (S/. 60) ");
        System.out.println("2. Luces (S/. 25) ***");
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
                "\nTipo de motor: " + tipo_motor;
    }
}

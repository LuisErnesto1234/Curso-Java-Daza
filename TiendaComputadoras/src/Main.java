import models.Inventario;
import models.Orden;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        Inventario monitor = new Inventario();
        Orden boleta = new Orden();

        do {
            System.out.println("\t:::MENU:::");
            System.out.println("1. Registrar Monitor");
            System.out.println("2. Registrar Teclado");
            System.out.println("3. Registrar Raton");
            System.out.println("4. Mostrar Inventario");
            System.out.println("5. Registrar Computadora");
            System.out.println("6. Crear Orden");
            System.out.println("7. Mostrar Ordenes");
            System.out.println("8. salir");
            System.out.println("Ingrese su eleccion: ");
            op = sc.nextInt();

            switch (op){
                case 1:
                monitor.registrarMonitor();
                    break;
                case 2:
                    monitor.registrarTeclado();
                    break;
                case 3:
                    monitor.registrarMouse();
                    break;
                case 4:
                    monitor.mostrarInventario();
                    break;
                case 5:
                    monitor.registrarComputadora();
                    break;
                case 6:
                    boleta.agregarComputadorasVender();
                    break;
                case 7:
                    boleta.registrarOrden();
                    break;
                case 8:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }while (op != 8);
    }


}

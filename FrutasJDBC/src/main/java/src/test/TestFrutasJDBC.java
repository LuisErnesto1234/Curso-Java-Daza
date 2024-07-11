package src.test;

import src.datos.FrutaDAO;
import src.domain.Fruta;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestFrutasJDBC {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        FrutaDAO frutaDAO = new FrutaDAO();
        int op;
        do {
            System.out.println(" ___::::MENU::::___");
            System.out.println("[1] Mostrar Frutas");
            System.out.println("[2] Insertar Fruta");
            System.out.println("[3] Eliminar Fruta");
            System.out.println("[4] Modificar Fruta");
            System.out.println("[5] Salir");
            System.out.print("Ingrese su elección: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("\t\t\t\t\t\t\t\t\tMostrando la fruta en formato de tabla");
                    System.out.println("________________________________________________________________________________________________________");
                    System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s %-20s %n", "ID", "Nombre", "Color", "P. Unidad", "Cantidad", "P. Total", "Fecha");
                    System.out.println("________________________________________________________________________________________________________");
                    for (Fruta f : frutaDAO.seleccionar()) {
                        System.out.printf("%-10d %-15s %-15s %-15.2f %-15d %-15.2f %-20s %n", f.getIdFruta(), f.getNombreFruta(), f.getColorFruta(), f.getPrecioUnitario(), f.getCantidad(), f.getPrecioTotal(), f.getFechaCreacion());
                    }
                    System.out.println("________________________________________________________________________________________________________");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la fruta: ");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese el color de la fruta: ");
                    String color = sc.nextLine();
                    System.out.println("Ingrese el precio unitario de la fruta: ");
                    double precioUnitario = sc.nextDouble();
                    System.out.println("Ingrese la cantidad de la fruta: ");
                    int cantidad = sc.nextInt();
                    double precioTotal = precioUnitario * cantidad;
                    LocalDateTime fechaActual = LocalDateTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    String fechaCreacion = fechaActual.format(formatter);

                    Fruta fruta = new Fruta(nombre, color, precioUnitario, cantidad, precioTotal, fechaCreacion);
                    frutaDAO.insertar(fruta);
                    break;
                case 3:
                    System.out.print("Ingrese el id a eliminar: ");
                    int id = sc.nextInt();
                    frutaDAO.eliminar(id);
                    break;
                case 4:
                    System.out.print("Ingrese el id a modificar: ");
                    int idModificar = sc.nextInt();
                    frutaDAO.actualizar(idModificar);
                    break;
                case 5:
                    System.out.println("Adios 🐓");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (op != 5);
    }
}
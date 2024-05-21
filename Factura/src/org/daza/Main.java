package org.daza;

import org.daza.modelos.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setRuc("12131");
        cliente.setNombre("Luis");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la descripcion de la factura: ");
        Factura factura = new Factura(sc.nextLine(), cliente);

        Producto producto;
        /*String nombre;
        int cantidad;
        double precio;*/

        System.out.println();

        for (int i = 0; i < 2; i++) {
            producto = new Producto();
            System.out.print("Ingrese el nombre del producto " + producto.getId() + ": ");
            producto.setNombre(sc.nextLine());
            System.out.print("Ingrese el precio del producto " + producto.getId()+ ": ");
            producto.setPrecio(sc.nextDouble());
            System.out.print("Ingrese la cantidad del producto " + producto.getId()+ ": ");

            factura.addItemFactura(new ItemFactura(sc.nextInt(), producto));
            System.out.println();
            sc.nextLine();
        }

        System.out.println(factura.generarDetalle());
    }
}
package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Orden {
    private int idOrden;
    private static int contador = 0;

    public Orden() {
        this.idOrden = ++contador;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public double total(double precio){
         double total = 0;
         total += precio;
        return total;
    }
    List<Computadora> registro = new ArrayList<>();

    public void agregarComputadorasVender(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Estas son las computadoras registradas: ");
        Inventario compu = new Inventario();
        int aux = 0;
        int opcion;
        double price, actualPrecio;
        List<Computadora> computadoras = compu.obtenerComputadoras();
        for (Computadora computadora : computadoras) {
            System.out.println(aux +" "+compu.mostrarComputadoras());
            aux++;
        }
            System.out.println("Elija la computadora a agregar: ");
            opcion = sc.nextInt();
            price = computadoras.get(opcion).getPrecio();
            registro.add(computadoras.get(opcion));

            actualPrecio = total(price);
            System.out.println("EL total actual es: " + actualPrecio);
        do {
            System.out.println("Desea agregar otra computadora? 1.Si 2.No");
            int opcion2 = sc.nextInt();
            if (opcion2 == 1) {
                System.out.println("Elija la computadora a agregar: ");
                for (Computadora computadora : computadoras) {
                    System.out.println(aux +" "+compu.mostrarComputadoras());
                    aux++;
                }
                opcion = sc.nextInt();
                price = computadoras.get(opcion).getPrecio();
                registro.add(computadoras.get(opcion));

                actualPrecio = total(price);
                System.out.println("EL total actual es: " + actualPrecio);
            } else {
                System.out.println("El total final es: " + actualPrecio);
            }

        }while (opcion != 2);

    }

    public String registrarOrden(){
        StringBuilder sb = new StringBuilder();
        sb.append("ID: " + this.getIdOrden())
                .append("Computadoras: ");
        double total = 0;
        for (Computadora com : registro){
            sb.append(com.toString());
            total += com.getPrecio();
        }
        sb.append("EL total es: " + total);

        return sb.toString();
    }

}
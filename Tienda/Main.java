package Tienda;
/*Hacer un programa permita registrar productos con proveedores*/

import java.util.Scanner;

public class Main {
    public static int buscarProducto(Producto[] p, int n) {
        int indice = 0;
        int i = 0;
        boolean encontrado = false;

        while((i < p.length) && (!encontrado)) {
            if (p[i].getIdProducto() == n) {
                indice = i;
                encontrado = true;
            }
        }

        if (!encontrado) {
            indice = -1;
        }

        return indice;

    }

    public static int buscarProveedor(Proveedor[] p, int n) {
        int indice = 0;
        int i = 0;
        boolean encontrado = false;
        while((i < p.length) && (!encontrado)) {
            if (p[i].getIdProveedor() == n) {
                indice = i;
                encontrado = true;
            }
        }
        if (!encontrado) {
            indice = -1;
        }

        return indice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idProducto, idProveedor, op, indiceProveedor = 0, indiceProducto = 0, busquedaProveedor, busquedaProducto;
        String nombreProducto, nombreProveedor;
        double precio;
        Proveedor[] proveedores = new Proveedor[100];
        Producto[] productos = new Producto[100];

        do {
            System.out.println("********************************");
            System.out.println("\t\t...:::MENU:::...");
            System.out.println("1. Registrar Proveedor");
            System.out.println("2. Registro Producto");
            System.out.println("3. Consultar Producto");
            System.out.println("4. Consultar Proveedor");
            System.out.println("5. Borrar Proveedor");
            System.out.println("6. Borrar Producto");
            System.out.println("7. Salir");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Ingrese el ID del proveedor: ");
                    idProveedor = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese el nombre del proveedor: ");
                    nombreProveedor = sc.nextLine();
                    proveedores[indiceProveedor] = new Proveedor(idProveedor, nombreProveedor);
                    System.out.println("Proveedor registrado con exito 🥳🥳");
                    indiceProveedor++;
                    break;
                case 2:
                    System.out.println("Ingrese el codigo del proveedor: ");
                    idProveedor = sc.nextInt();
                    busquedaProveedor = buscarProveedor(proveedores, idProveedor);
                    if (busquedaProveedor == -1) {
                        System.out.println("El proveedor no existe 🐔🐔");
                    } else {
                        System.out.print("Ingrese el ID del producto: ");
                        idProducto = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingrese el nombre del producto: ");
                        nombreProducto = sc.nextLine();
                        sc.nextLine();
                        System.out.println("Ingrese el precio del producto " + nombreProducto + ": ");
                        precio = sc.nextDouble();

                        Proveedor proveedorObj = proveedores[busquedaProveedor]; // Obtener el proveedor específico
                        productos[indiceProducto] = new Producto(idProducto, nombreProducto, precio, proveedorObj);
                        System.out.println("Producto registrado con exito 🥳🥳");
                        indiceProducto++;
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el ID del producto: ");
                    idProducto = sc.nextInt();
                    busquedaProducto = buscarProducto(productos, idProducto);
                    if (busquedaProducto == -1) {
                        System.out.println("El producto no existe 🤣🤣");
                    } else {
                        Producto productoSeleccionado = productos[busquedaProducto];
                        System.out.println("Detalles del Producto:");
                        System.out.println(productoSeleccionado.mostrarProducto());

                        // Imprimir detalles del proveedor asociado al producto
                        Proveedor proveedorProducto = productoSeleccionado.getProveedor();
                        System.out.println("Detalles del Proveedor del Producto:");
                        System.out.println(proveedorProducto.mostrarProveedor());
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el ID del Proveedor: ");
                    idProveedor = sc.nextInt();
                    busquedaProveedor = buscarProveedor(proveedores, idProveedor);
                    if (busquedaProveedor == -1) {
                        System.out.println("El proveedor no existe 🐔🥳");
                    } else {
                        // Mostrar todos los productos relacionados con el proveedor
                        System.out.println("Productos relacionados:");
                        for (int i = 0; i < indiceProducto; i++) {
                            assert productos[i] != null;
                            if (productos[i].getIdProveedor() == idProveedor) {
                                System.out.println(productos[i].mostrarProducto());
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el ID del proveedor: ");
                    idProveedor = sc.nextInt();
                    System.out.println("Desea continuar con la eliminacion del provedor");
                    System.out.print("Se eliminaran todos los productos relacionados a este: (s)(n)");
                    char respuesta = sc.next().charAt(0);
                    if (respuesta == 's' || respuesta == 'S') {
                        busquedaProveedor = buscarProveedor(proveedores, idProveedor);
                        if (busquedaProveedor == -1) {
                            System.out.println("El proveedor no existe 🐔🐔");
                        } else {
                            // Borrar el proveedor
                            proveedores[busquedaProveedor] = null;
                            for (int i = 0; i < indiceProducto; i++) {
                                assert productos[i] != null;
                                if (productos[i].getIdProveedor() == idProveedor) {
                                    productos[i] = null;
                                }
                            }
                            System.out.println("Proveedor eliminado con exito 🥳🎉");
                            System.out.println("Productos eliminados con exito 👻👻");
                        }
                    } else {
                        System.out.println("Buena eleecion no se borro ningun proveedor 😶");
                    }
                    break;
                case 6:
                    System.out.print("Ingrese el id del producto: ");
                    idProducto = sc.nextInt();
                    busquedaProducto = buscarProducto(productos, idProducto);
                    if (busquedaProducto == -1) {
                        System.out.println("El producto no existe 🤣🤣");
                    } else {
                        // Borrar el producto
                        productos[busquedaProducto] = null;
                        System.out.println("Producto eliminado con exito 🥳🎉");
                    }
                    break;
                case 7:
                    System.out.println("Adios 🥑🥑");
                    break;
                default:
                    System.out.println("Opcion no valida 🥵🥵");
                    break;
            }
        } while (op != 7);
    }
}

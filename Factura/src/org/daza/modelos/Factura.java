package org.daza.modelos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int idFactura;
    private String description;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura []itemFacturas;
    private int indiceItems;
    public static final int MAX_ITEMS = 10;
    public static int ultimoId;


    public Factura(String description, Cliente cliente) {
        this.description = description;
        this.cliente = cliente;
        this.itemFacturas = new ItemFactura[MAX_ITEMS];
        this.idFactura = ++ultimoId;
        this.fecha = new Date();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ItemFactura[] getItemFacturas() {
        return itemFacturas;
    }

    public void addItemFactura(ItemFactura item){
        if (indiceItems < MAX_ITEMS) {
            this.itemFacturas[indiceItems++] = item;
        }
    }

    public double calcularTotal(){
        double total = 0;

        for (int i = 0; i < indiceItems; i++) {
            ItemFactura factura = this.itemFacturas[i];
            total += factura.calcularImporte();
        }
        return total;
    }

    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura N°: ");
        sb.append(this.idFactura)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\nRUC: ").append(this.cliente.getRuc())
                .append("\nDescripcion: ").append(this.description)
                .append("\n");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sb.append("\nFecha Emicion: ")
                .append(sdf.format(this.fecha))
                .append("\n")
                .append("\n#\tNombre: \tPrecio: \tCantidad:\tTotal\n");;

        for (int i = 0; i < indiceItems; i++) {
            ItemFactura item = itemFacturas[i];
            sb.append(item.getProducto().getId());
            sb.append("\t");
            sb.append(item.getProducto().getNombre());
            sb.append("\t\t");
            sb.append(item.getProducto().getPrecio());
            sb.append("\t\t");
            sb.append(item.getCantidad());
            sb.append("\t\t");
            sb.append(item.calcularImporte());
            sb.append("\t\t");
            sb.append("\n");
        }

        sb.append("\nTotal: ").append(this.calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}

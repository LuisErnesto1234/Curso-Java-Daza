package models;

public class Computadora {
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contador = 0;
    private double precio;

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton, double precio) {
        this.idComputadora = ++contador;
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
        this.precio = precio;
    }


    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }


    public Raton getRaton() {
        return raton;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Computadora: 🖥️" +
                "idComputadora: " + idComputadora +
                " nombre: " + nombre + "\n" +
                " monitor: " + monitor + "\n" +
                " teclado: " + teclado + "\n" +
                " raton: " + raton + "\n" +
                " precio: " + precio;
    }
}
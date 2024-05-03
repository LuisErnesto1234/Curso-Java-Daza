package ProyectoVehiculos;

public class Camion extends Vehiculo implements Reparacion{
    private double carga;

    public Camion(String marca, String modelo, int annioFabricacion, double precio, double carga) {
        super(marca, modelo, annioFabricacion, precio);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public void calcularImpuesto() {
        double impuesto = 0;
        double precio;
        if(carga > 1000){
            impuesto = 0.15;
        }
        else{
            impuesto = 0.10;
        }
        precio = getPrecio() * impuesto;

        System.out.println("Bienvenido a calcula tu impuesto.com 😎🛻");
        System.out.println("El precio de su impuesto es: " + precio);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCarga: " + carga;
    }

    @Override
    public void reparar() {
        System.out.println("Le va a costar 30 soles la reparacion a su camion");
    }
}

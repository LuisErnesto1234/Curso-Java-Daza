package Polimorfismo_Java;

public class VehiculoFurgoneta extends Vehiculo{
    private int carga;

    public VehiculoFurgoneta(String placa, String marca, String modelo, int carga) {
        super(placa, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return this.carga;
    }

    @Override
    public String mostrarDatos(){
        return  super.mostrarDatos() + "\nLa carga es: " + this.carga;
    }
}

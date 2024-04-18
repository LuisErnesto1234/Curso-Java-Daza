package Polimorfismo_Java;

public class VehiculoTurismo extends Vehiculo{
    private int nPuertas;

    public VehiculoTurismo(String placa, String marca, String modelo, int nPuertas) {
        super(placa, marca, modelo);
        this.nPuertas = nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    @Override
    public String mostrarDatos(){
        return super.mostrarDatos() + "\nPuertas: " + this.nPuertas;
    }

}

package Polimorfismo_Java;

public class VehiculoDeportivo extends Vehiculo{
    private int cilindrada;

    public VehiculoDeportivo(String placa, String marca, String modelo, int cilindrada){
        super(placa, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    @Override
    public String mostrarDatos(){
        return super.mostrarDatos() + placa + "\nCilindrada: " + cilindrada;
    }
}
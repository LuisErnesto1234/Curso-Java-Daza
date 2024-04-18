package Polimorfismo_Java;

public class Vehiculo {
    protected String placa;
    protected String marca;
    protected String modelo;

    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String mostrarDatos(){
        return "La marca es:" + marca + "\nEl modelo es: " + modelo + "\nLa placa es: " + placa;
    }
}

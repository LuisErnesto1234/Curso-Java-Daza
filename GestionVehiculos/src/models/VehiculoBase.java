package models;

import java.util.Objects;

public class VehiculoBase implements VehiculoInfo{

    private String marca;
    private String modelo;
    private int anio;
    private TipoCombustible combustible;

    public VehiculoBase(String marca, String modelo, int anio, TipoCombustible combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.combustible = combustible;
    }

    public VehiculoBase(){

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public TipoCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(TipoCombustible combustible) {
        this.combustible = combustible;
    }

    @Override
    public String ObtenerDetalles() {
        return "";
    }

    @Override
    public TipoCombustible obtnerCombustible() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehiculoBase that = (VehiculoBase) o;
        return anio == that.anio && Objects.equals(marca, that.marca) && Objects.equals(modelo, that.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, anio);
    }
}
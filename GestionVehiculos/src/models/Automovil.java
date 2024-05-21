package models;

public class Automovil extends VehiculoBase {
    private int numPuertas;

    public Automovil(String marca, String modelo, int anio, TipoCombustible combustible, int numPuertas) {
        super(marca, modelo, anio, combustible);
        this.numPuertas = numPuertas;
    }

    public Automovil() {
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String ObtenerDetalles() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t\t::::MostrarDetalle 🤠::::")
                .append("\nMarca: ")
                .append(getMarca())
                .append("\nModelo: ")
                .append(getModelo())
                .append("\nAño: ")
                .append(getAnio())
                .append("\nTipo de combustible; ")
                .append(getCombustible())
                .append("\nNumero de puertas: ")
                .append(getNumPuertas());

        return sb.toString();
    }
}
package models;

public class Motocicleta extends VehiculoBase{
    private String tipoMoto;

    public Motocicleta(String marca, String modelo, int anio, TipoCombustible combustible, String tipoMoto) {
        super(marca, modelo, anio, combustible);
        this.tipoMoto = tipoMoto;
    }

    public Motocicleta() {
    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }
    @Override
    public String ObtenerDetalles(){
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
                .append("\nTipo de Moto: ")
                .append(getTipoMoto());

        return sb.toString();
    }
}
package models;

public class Teclado extends DispositivoEntrada {
    private int idTeclado;
    private static int contadorTeclados = 0;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++contadorTeclados;
    }


    public int getIdTeclado() {
        return idTeclado;
    }

    public void setIdTeclado(int idTeclado) {
        this.idTeclado = idTeclado;
    }

    public int getContadorTeclados() {
        return contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "idTeclado=" + idTeclado +
                ", contadorTeclados=" + contadorTeclados +
                '}';
    }
}
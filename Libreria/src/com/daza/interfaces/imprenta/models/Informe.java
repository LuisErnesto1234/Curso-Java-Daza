package com.daza.interfaces.imprenta.models;

public class Informe extends Hoja implements Imprimible{
    private String autor;
    private String supervisor;

    public Informe(String autor, String supervisor,String contenido) {
        super(contenido);
        this.autor = autor;
        this.supervisor = supervisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: " + autor +
                "\nSupervisado por: " + supervisor +
                "\nContenido: " + this.contenido;
    }
}
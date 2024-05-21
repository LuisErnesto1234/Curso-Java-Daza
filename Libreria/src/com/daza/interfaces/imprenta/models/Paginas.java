package com.daza.interfaces.imprenta.models;

public class Paginas extends Hoja{
    public Paginas(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return this.contenido;
    }
}

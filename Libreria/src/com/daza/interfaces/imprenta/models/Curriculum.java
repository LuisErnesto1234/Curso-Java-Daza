package com.daza.interfaces.imprenta.models;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{
    private String persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculum(String contenido, String persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculum addExperiencias(String ex){
        experiencias.add(ex);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\nResumen: ").append(this.contenido)
                .append("\nCarrera: ").append(this.carrera).append("\n")
                .append("\nExperiencias: \n");

                for (String e : experiencias){
                    sb.append("- ").append(e).append("\n");
                }
        return sb.toString();
    }
}
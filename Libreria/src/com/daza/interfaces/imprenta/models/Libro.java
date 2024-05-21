package com.daza.interfaces.imprenta.models;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{
    private List<Imprimible> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPaginas(Imprimible pagina) {
        paginas.add(pagina);
        return this;
    }

    @Override
    public String imprimir(){
        StringBuilder sb = new StringBuilder("Titulo: ")
        .append(titulo)
               .append("\nAutor: ")
                        .append(autor)
                        .append("\n")
                        .append(genero)
                        .append("\n").append("Paginas: ");

        for (Imprimible p : paginas){
            sb.append(p.imprimir()).append("\n");
        }

        return sb.toString();
    }
}

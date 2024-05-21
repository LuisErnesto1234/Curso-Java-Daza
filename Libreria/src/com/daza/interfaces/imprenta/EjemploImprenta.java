package com.daza.interfaces.imprenta;

import com.daza.interfaces.imprenta.models.*;

import static com.daza.interfaces.imprenta.models.Genero.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum("Resumen laboral...", "Luis Daza", "Ing, Sistemas");
        cv.addExperiencias("Java")
                .addExperiencias("C++")
                .addExperiencias("Excel")
                .addExperiencias("Python");

        Libro libro = new Libro("Luis Daza", "Java Con esteroides", Terror);
        libro.addPaginas(new Paginas("Obra maestra"))
                .addPaginas(new Paginas("LIbertdad"))
                .addPaginas(new Paginas("El elenco"));

        Informe informe = new Informe("CLuadio Gallardo", "Sasi Muller", "Algo sobre Spring framework 🤠");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

    }

    public static void imprimir(Imprimible h) {
        System.out.println(h.imprimir());


    }
}

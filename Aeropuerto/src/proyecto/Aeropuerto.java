package proyecto;

import java.util.ArrayList;

public class Aeropuerto {
    private String nombre;
    private String ciudad;
    private String pais;
    private ArrayList<Compannia> listaCompannia = new ArrayList<>();
    private int numCompannia = 0;

    public Aeropuerto(String ciudad, String nombre, String pais) {
        this.ciudad = ciudad;
        this.nombre = nombre;
        this.numCompannia = 0;
        this.pais = pais;
    }

    public Aeropuerto(String ciudad, ArrayList<Compannia> listaCompannia, String nombre, String pais) {
        this.ciudad = ciudad;
        this.nombre = nombre;
        this.listaCompannia = listaCompannia;
        this.pais = pais;
        this.numCompannia = listaCompannia.size();
    }

    public String getCiudad() {
        return ciudad;
    }

    public ArrayList<Compannia> getListaCompannia() {
        return listaCompannia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumCompannia() {
        return numCompannia;
    }

    public String getPais() {
        return pais;
    }

    public Compannia buscarCompannia(String nombre){

        Compannia com = null;

        for (Compannia l : listaCompannia){
            if (nombre.equals(l.getNombre())){
                System.out.println(l.getNombre());
                com = l;
                break;
            }
            else {
                System.out.println("No fue encontrado este nombre: " + nombre);
            }
        }

        return com;
        }
    }
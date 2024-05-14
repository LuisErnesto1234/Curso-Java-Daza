package proyecto;

import java.util.ArrayList;

public class ArepuertoPrivado extends Aeropuerto{
    private ArrayList<String> empresas = new ArrayList<>();
    private int numEmpresas;

    public ArepuertoPrivado(String ciudad, String nombre, String pais) {
        super(ciudad, nombre, pais);
    }

    public ArepuertoPrivado(String ciudad, ArrayList<Compannia> listaCompannia, String nombre, String pais, ArrayList<String> empresas) {
        super(ciudad, listaCompannia, nombre, pais);
        this.empresas = empresas;
        this.numEmpresas = empresas.size();
    }

    public void insertarEmpresas(ArrayList<String> e){
        this.empresas = e;
        this.numEmpresas = e.size();
    }

    public void insertarEmpresa(String e){
        empresas.add(e);
    }

    public ArrayList<String> getEmpresas() {
        return empresas;
    }

    public int getNumEmpresas() {
        return numEmpresas;
    }
}

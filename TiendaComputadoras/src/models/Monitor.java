package models;

import java.util.*;

public class Monitor {
    private int idMonitor;
    private String marca;
    private double tamannio;
    private static int contadorMonitores = 0;

    public Monitor(String marca, double tamannio) {
        this.marca = marca;
        this.tamannio = tamannio;
        this.idMonitor = ++contadorMonitores;
    }
    public Monitor(){
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getIdMonitor() {
        return idMonitor;
    }


    public double getTamannio() {
        return tamannio;
    }

    public void setTamannio(double tamannio) {
        this.tamannio = tamannio;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", tamannio=" + tamannio +
                '}';
    }
}
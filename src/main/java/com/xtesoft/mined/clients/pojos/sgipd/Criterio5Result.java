package com.xtesoft.mined.clients.pojos.sgipd;

public class Criterio5Result {
    public Long Guardados;
    public Long Procesados;
    public Long Sin_Calificacion;
    public Long Existentes;

    @Override
    public String toString() {
        return "Criterio5Result{" +
                "Guardados=" + Guardados +
                ", Procesados=" + Procesados +
                ", Sin_Calificacion=" + Sin_Calificacion +
                ", Existentes=" + Existentes +
                '}';
    }
}

/*
Juan Alberto Cuevas Juarez
27/05/2024
POO
 */

package com.aluracursos.app2_radioAlura.modelos;  //paquete modelos

public class Podcast {   //subclase de Audio

    //atributos

    private String presentador;
    private String descripcion;


    //getters and setters


    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
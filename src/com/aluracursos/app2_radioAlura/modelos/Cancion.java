/*
Juan Alberto Cuevas Juarez
27/05/2024
POO
 */

package com.aluracursos.app2_radioAlura.modelos;  //paquete modelos

public class Cancion extends Audio {  //Cancion es subclase de Audio, relacion de herencia entre la clase Cancion y Audio

    //atributos

    private String album;
    private String cantante;
    private String genero;

    //sobrescribir

    @Override
    public int getClasificacion() {
        //clasificacion con reglas
        if(getTotalDeMeGustas() > 5000){
            return 8; //retorna una calificacion de 8
        }else {
            return 4; //retorna una calificacion de 4
        }
    }


    //getters and setters

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

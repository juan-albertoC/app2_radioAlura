package com.aluracursos.app2_radioAlura.modelos;

public class Audio {
    //atributos
    private String titulo;
    private int duracion;
    private int totalDeReproducciones;  //variable de incremento
    private int totalDeMeGustas;  //variable de incremento
    private int meGusta;
    private int clasificacion;

    //metodos de funcionalidad de cualquier audio dentro del radio
    public void meGusta(){   //metodo que incrementa los meGustas

        this.totalDeMeGustas++;  

    }

    public void reproducir(){  //metodo que incrementa las reproducciones

        this.totalDeReproducciones++;
    }

    //getters and setters


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalDeMeGustas() {
        return totalDeMeGustas;
    }

    public void setTotalDeMeGustas(int totalDeMeGustas) {
        this.totalDeMeGustas = totalDeMeGustas;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(int meGusta) {
        this.meGusta = meGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}

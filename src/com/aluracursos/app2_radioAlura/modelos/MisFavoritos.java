/*
Juan Alberto Cuevas Juarez
27/05/2024
POO
 */

package com.aluracursos.app2_radioAlura.modelos;       //paquete modelos

public class MisFavoritos {
    public void adicionar(Audio audio){         //metodo adicionar un nuevo Audio tanto (Cancion o Podcast) de lo que seria mis favoritos

          //criterios
        if (audio.getClasificacion() >= 8){
            System.out.println(audio.getTitulo() + "Es uno de los favoritos del momento");
        } else {
            System.out.println(audio.getTitulo() + "Tambien es uno de los favoritos");
        }
    }
}

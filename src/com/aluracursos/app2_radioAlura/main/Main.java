/*
Juan Alberto Cuevas Juarez
27/05/2024
POO
 */

package com.aluracursos.app2_radioAlura.main;   //paquete main

import com.aluracursos.app2_radioAlura.modelos.Cancion;  //importar paquete modelos y nombre de la subclase Cancion
import com.aluracursos.app2_radioAlura.modelos.Podcast;  //importar paquete modelos y nombre de la subclase Podcast
import com.aluracursos.app2_radioAlura.modelos.MisFavoritos;

public class Main {     //clase Main dentro del paquete main

    public static void main(String[] args) {   //metodo main para ejecutar test

        Cancion miCancion = new Cancion();  //crear instancia 1 cuyo objeto ya almacenado en memoria
        miCancion.setTitulo("Forever");     //invocar objeto con sus atributos
        miCancion.setCantante("Kiss");      //invocar objeto con sus atributos

        Podcast miPodcast = new Podcast();        //crear instancia 2 cuyo objeto ya almacenado en memoria
        miPodcast.setPresentador("Juan Cuevas");  //invocar objeto con sus atributos
        miPodcast.setTitulo("Tech Job");          //invocar objeto con sus atributos

        //test de metodo meGusta() para objeto miCancion
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }

        //test de metodo reproducir() para objeto miCancion
        for (int i = 0; i < 2000; i++) {
            miCancion.reproducir();
        }

        //---------------------------------------------------------

        //test de metodo meGusta() para objeto miPodcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }

        //test de metodo reproducir() para objeto miPodcast
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproducir();
        }


        //Imprimir valores
        System.out.println("--------------Imprimir valores-----------");
        System.out.println("Total de reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de me Gusta: " + miCancion.getTotalDeMeGustas());


        //Llamada y crear la nueva instancia 3
        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicionar(miPodcast);
        favoritos.adicionar(miCancion);



    }
}

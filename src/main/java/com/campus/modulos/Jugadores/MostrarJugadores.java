package com.campus.modulos.Jugadores;

import java.util.ArrayList;

public class MostrarJugadores {
    
    public void listarjugadores(ArrayList<Jugador> jugadores){
        int temp = 0;

        for (Jugador jugador : jugadores) {

            System.out.println(temp + ". " + jugador.getNombre());
            temp ++;
            
        }
    }
}

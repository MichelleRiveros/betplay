package com.campus.modulos.Jugadores;

import java.util.ArrayList;

public class ListaJugadores {
    ArrayList<Jugador> jugadores;

    public ListaJugadores(){
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    
}



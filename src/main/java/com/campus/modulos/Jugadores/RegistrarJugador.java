package com.campus.modulos.Jugadores;
import java.util.Scanner;
import java.util.ArrayList;

import com.campus.modulos.Equipos.Equipo;

public class RegistrarJugador {
    
    ArrayList<Jugador> jugadores;

    public RegistrarJugador(){
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador,  ArrayList<Jugador> listaJugador){
        this.jugadores.add(jugador);
        listaJugador.add(jugador);
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void registrarJugador(Scanner sc,  ArrayList<Jugador> listaJugador){

        System.out.println("Ingrese ID del jugador");
        int idJugador = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese nombre del jugador");
        String nombreJugador = sc.nextLine();

        System.out.println("Ingrese apellido del jugador");
        String apellidoJugador = sc.nextLine();

        System.out.println("Ingrese edad del jugador");
        int edadJugador = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese nacionalidad del jugador");
        String nacionalidadJugador = sc.nextLine();

        System.out.println("Ingrese dorsal del jugador");
        int dorsalJugador = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese posicion de juego del jugador");
        String posicionDeJuegoJugador = sc.nextLine();

        System.out.println("Ingrese fecha de ingreso del jugador");
        String fechaDeingresoJugador = sc.nextLine();

        System.out.println("Ingrese goles anotados del jugador");
        int golesAnotadosJugador = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese total tarjetas rojas del jugador");
        int tarjetasRojasJugador = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese total tarjetas amarillas del jugador");
        int tarjetasAmarillasJugador = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese precio del jugador");
        double precioJugador = Double.parseDouble(sc.nextLine());

        Jugador jugador1 = new Jugador(idJugador, nombreJugador, apellidoJugador, edadJugador, nacionalidadJugador, dorsalJugador, posicionDeJuegoJugador, fechaDeingresoJugador,golesAnotadosJugador,tarjetasRojasJugador, tarjetasAmarillasJugador,precioJugador);
        agregarJugador(jugador1, listaJugador);

        int temp = 0;

        for (Jugador jugador : jugadores) {
            System.out.println( temp + ". " + jugador.getDorsal());
            temp++;
        }

        for (Jugador jugador : listaJugador) {
            System.out.println( temp + ". " + jugador.getDorsal());
            temp++;
        }
    
    }


    
}



package com.campus.modulos.Registros;

import java.util.ArrayList;
import java.util.Scanner;

import com.campus.modulos.Equipos.Equipo;
import com.campus.modulos.Equipos.RegistrarEquipo;
import com.campus.modulos.Jugadores.Jugador;
import com.campus.modulos.Jugadores.RegistrarJugador;

public class Registro {


    public Registro(){};

    public void registros(Scanner sc, ArrayList<Equipo> equiposDeFutbol,  ArrayList<Jugador> listaJugador){

        RegistrarEquipo equipos = new RegistrarEquipo();
        RegistrarJugador jugadores = new RegistrarJugador();
        

        boolean flag = true;
        while (flag){

            System.out.println("1. Registrar equipo \n2. Registrar jugador \n3. Registrar integrante de cuerpo tecnico" + 
                    "\n4. Registrar integrante de cuerpo tecnico \n5. Registrar partido \n6. Salir");

            
            switch (Integer.parseInt(sc.nextLine())) {

                case 1: 
                
                    equipos.registrarEquipo(sc, equiposDeFutbol);
                    break;
                
                case 2:     
                    jugadores.registrarJugador(sc, listaJugador); 
                    break;
                
                case 3:
                    System.out.println("holi");
                    break;
                
                case 4:  
                    System.out.println("holi");
                    break;
                
                case 5:
                    System.out.println("holi");
                    break;
                
                case 6:
                    flag = false;
                    break;
            
                default:
                    break;
            }
        }
    }        
}

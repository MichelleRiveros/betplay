package com.campus;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Equipo> equipos = new ArrayList<Equipo>();
        ArrayList<Partido> partidos = new ArrayList<Partido>(); 
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvedio a BetPlay \nIngrese la opcion a la que desea ingresar: \n1. Registrar Equipo \n2. Registrar Partidos \n3. Tabla de Posiciones \n4. Reportes \n5. Partidos Jugados \n6. Equipos");
        
        switch (sc.nextInt()) {
            case 1:
                
                break;
            
            case 2:
                
                break;
                
            case 3:
                
                break;

            case 4:
                
                break;
            
            case 5:
                
                break;

            case 6:
                
                break;

            case 7:
                
                break;

            default:
                System.out.println("Error de opcion");
        }

        System.out.println("Registrar Equipo: ");
    }
}
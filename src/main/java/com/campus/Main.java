package com.campus;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Equipo> equipos = new ArrayList<Equipo>();
        ArrayList<Partido> partidos = new ArrayList<Partido>(); 
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvedio a BetPlay \nIngrese la opcion a la que desea ingresar: \n1. Registrar Equipo \n2. Registrar Partidos \n3. Tabla de Posiciones \n4. Reportes \n5. Partidos Jugados \n6. Equipos");
        int opc = sc.nextInt();
        sc.nextLine();

        switch (opc) {
            case 1:
                System.out.println("Ingrese el nombre del equipo");
                String nombreEquipo = sc.nextLine();
                Equipo agregarEquipo = new Equipo(nombreEquipo);
                equipos.add(agregarEquipo);
                System.out.println(String.format("El equipo %s ha sido agregado con exito", agregarEquipo.getnombre()));
                break;
            
            case 2:
                System.out.println("Ingrese los siguientes datos:");
                System.out.println("Fecha del Partido");

                String fechaPartido = sc.nextLine();
                int temp = 0;

                for (Equipo equipos2 : equipos) {
                    System.out.println( temp + ". " +equipos2);
                    temp++;
                }

                System.out.println("Selecciona equipo local: ");
                int idEquipo = sc.nextInt();
                Equipo equipoLocal = equipos.get(idEquipo);
                
                System.out.println("Goles del equipo local: ");
                int golesEquipoLocal = sc.nextInt();
                

                System.out.println("Selecciona equipo visitante: ");
                idEquipo = sc.nextInt();
                Equipo equipoVisitante = equipos.get(idEquipo);

                System.out.println("Goles del equipo visitante: ");
                int golesEquipoVisitante = sc.nextInt();
                
                Partido partido = new Partido(fechaPartido, equipoLocal, equipoVisitante, golesEquipoLocal, golesEquipoVisitante);
                partidos.add(partido);

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
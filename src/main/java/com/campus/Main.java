package com.campus;

import java.util.ArrayList;
import java.util.Scanner;
import com.campus.ListaEquipo;


public class Main {

    public static void main(String[] args) {

        ListaEquipo equipos = new ListaEquipo();
        ArrayList<Partido> partidos = new ArrayList<Partido>(); 
        Partido instanciaPartido = new Partido();

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        while (flag) {

            System.out.println("Bienvedio a BetPlay \nIngrese la opcion a la que desea ingresar: \n1. Registrar Equipo \n2. Registrar Partido"+
                            "\n3. Reportes \n4. Tabla de Posiciones \n5. Salir");
            int opc = sc.nextInt();
            sc.nextLine();


            switch (opc) {
                case 1:
                    System.out.println("Ingrese el nombre del equipo");
                    String nombreEquipo = sc.nextLine();
                    Equipo equipo = new Equipo(nombreEquipo);
                    equipos.agregarEquipos(equipo);
                    System.out.println(String.format("El equipo %s ha sido agregado con exito", equipo.getnombre()));

                    break;
                
                case 2:

                    System.out.println("Ingrese los siguientes datos:");


                    System.out.println("Fecha del Partido");

                    String fechaPartido = sc.nextLine();

                    equipos.listarEquipos(); 

                    System.out.println("Selecciona equipo local: ");
                    int idEquipo = sc.nextInt();

                    
                    while(!equipos.ifExist(idEquipo)){
                        System.out.println("Ingrese un equipo valido");
                        idEquipo = sc.nextInt();
                    }
                    
                    Equipo equipoLocal = equipos.getListaEquipo(idEquipo);
                    
                    System.out.println("Goles del equipo local: ");
                    int golesEquipoLocal = sc.nextInt();
                    

                    System.out.println("Selecciona equipo visitante: ");
                    int idEquipoV = sc.nextInt();

                    while(!equipos.ifExist(idEquipoV) && idEquipoV != idEquipo){
                        System.out.println("Ingrese un equipo valido");
                        idEquipo = sc.nextInt();
                    }

                    Equipo equipoVisitante = equipos.getListaEquipo(idEquipoV);

                    System.out.println("Goles del equipo visitante: ");
                    int golesEquipoVisitante = sc.nextInt();
                    
                    Partido partido = new Partido(fechaPartido, equipoLocal, equipoVisitante, golesEquipoLocal, golesEquipoVisitante);
                    partido.determinarGanador(golesEquipoLocal,golesEquipoVisitante);
                 
                    partidos.add(partido);
                    break;
                    
                case 3:
                    reportes(equipos, sc, partidos);
                    break;

                case 4:
                    equipos.tabaPosiciones();
                    break;
                
                case 5:
                    flag = false;                
                    break;

                default:
                    System.out.println("Error de opcion");
            }
        }  
        
    }

    public static void reportes(ListaEquipo equipos, Scanner sc, ArrayList<Partido> partidos){

        boolean flag = true;
        while (flag){

            System.out.println("1. Nombre del equipo que màs goles anoto \n2. Nombre del equipo que màs puntos tiene" +
                                "\n3. Nombre del equipo que màs partidos gano \n4. Total de goles anotados por todos los equipos" +
                                "\n5. Promedio de goles anotados en el torneo \n6. Salir");

            switch (Integer.parseInt(sc.nextLine())) {
                case 1:
                    equipos.equipoMasGoles();
                    break;
                
                case 2:
                    equipos.equipoMasPuntos();
                    break;
                
                case 3:
                    equipos.equipoMasPartidosGanados();
                    break;
                
                case 4:
                    equipos.golesTotales();
                    break;
                
                case 5:
                    equipos.promedio(partidos);
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
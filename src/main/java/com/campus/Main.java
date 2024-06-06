package com.campus;

import java.util.ArrayList;
import java.util.Scanner;
import com.campus.ListaEquipo;


public class Main {

    public static void main(String[] args) {

        ListaEquipo equipos = new ListaEquipo();
        ArrayList<Partido> partidos = new ArrayList<Partido>(); 
        Equipo datosEquipo = new Equipo();
       

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        while (flag) {

            System.out.println("Bienvedio a BetPlay \nIngrese la opcion a la que desea ingresar: \n1. Registrar Equipo \n2. Registrar Partido"+
                            "\n3. Reportes \n4. Tabla de Posiciones \n5. Team \n6. Salir");
            int opc = sc.nextInt();
            sc.nextLine();


            switch (opc) {
                case 1:

                    System.out.println("Ingrese el nombre del equipo");
                    String nombreEquipo = sc.nextLine();

                    while(equipos.determinarSiYaExisteElEquipo(nombreEquipo)){
                        System.out.println("Ingrese el nombre del equipo");
                        nombreEquipo = sc.nextLine();
                    }

                    Equipo equipo = new Equipo(nombreEquipo);
                    equipos.agregarEquipos(equipo);
                    System.out.println(String.format("El equipo %s ha sido agregado con exito", equipo.getnombre()));

                    break;
                
                case 2:

                    if(equipos.determinarSiLaListaEstaLlena()){
                        break;
                    }

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

                    if(equipos.verificarNumerodePartidos()){
                        equipos.tabaPosiciones();
                    }

                    System.out.println("Los equipos no han jugado todos los partidos requeridos");
                    break;
                
                case 5:
                registros(sc);

                case 6: 
                    flag = false;

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

    public static void registros(Scanner sc){

        boolean flag = true;
        while (flag){

            System.out.println("1. Registrar jugadores \n2. Registrar profesional de cuerpo medico" +
                                "\n3. Registrar integrante del cuerpo tecnico \n4. Listar jugadores de un equipo" +
                                "\n5. Listar cuerpo tecnico \n6. Salir");

            
                                switch (Integer.parseInt(sc.nextLine())) {
                case 1: 
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
                    

                    
                    System.out.println("holi");
                    break;
                
                case 2:      
                    System.out.println("holi");
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
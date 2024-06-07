package com.campus.modulos.Jugadores;
import java.util.Scanner;

import com.campus.modulos.Persona;

public class Jugador extends Persona{
    int dorsal;
    String posicionDeJuego;
    String fechaDeIngreso;
    int golesAnotados;
    int totalRojas;
    int totalAmarillas;
    double precio;

    public Jugador(){};

    public Jugador(int id, String nombre, String apellido, int edad, String nacionalidad, int dorsal, String posicionDeJuego, String fechaDeIngreso, int golesAnotados, int totalRojas, int totalAmarillas, double precio){
        super(id, nombre, apellido, edad, nacionalidad);
        this.dorsal = dorsal;
        this.posicionDeJuego = posicionDeJuego;
        this.fechaDeIngreso = fechaDeIngreso;
        this.golesAnotados = golesAnotados;
        this.totalRojas = totalRojas;
        this.totalAmarillas = totalAmarillas;
        this.precio = precio;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getPosicionDeJuego() {
        return posicionDeJuego;
    }

    public String getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public int getGolesAnotados() {
        return golesAnotados;
    }

    public int getTotalRojas() {
        return totalRojas;
    }

    public int getTotalAmarillas() {
        return totalAmarillas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setPosicionDeJuego(String posicionDeJuego) {
        this.posicionDeJuego = posicionDeJuego;
    }

    public void setFechaDeIngreso(String fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }

    public void setTotalRojas(int totalRojas) {
        this.totalRojas = totalRojas;
    }

    public void setTotalAmarillas(int totalAmarillas) {
        this.totalAmarillas = totalAmarillas;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Jugador registrarJugador(){

        Scanner sc = new Scanner(System.in);

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

        sc.close();

        return jugador1;
    }
}




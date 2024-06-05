package com.campus;

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
}




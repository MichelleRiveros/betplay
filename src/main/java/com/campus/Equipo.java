package com.campus;


public class Equipo {

    private String nombre;
    private int pg = 0; //Partidos Ganados
    private int pp = 0; //Partidos Perdidos
    private int pe = 0; //Partidos Empatados
    private int gf = 0; //Goles a Favor
    private int gc = 0; //Goles en Contra
    private int tpa = 0; //Total de Partidos
    private int tpu = 0; //Total de Puntos


    public Equipo(String nombre){
        this.nombre = nombre;
    }

    public void gano(){
        this.pg++;
        this.tpu += 3;
        this.tpa++;
    }

    public void perdio(){
        this.pp++;
        this.tpa++;
    }

    public void empato(){
        this.pe++;
        this.tpu++;
        this.tpa++;
    }

    public void setGolesAfavor(int goles){
        this.gf += goles;
    }

    public void setGolesEnContra(int goles){
        this.gc += goles;
    }

    public String getnombre(){
        return this.nombre;
    }

    public int getpartidosganados(){
        return this.pg;
    }

    public int getPartidosperdidos() {
        return pp;
    }

    public int getPartidosempatados() {
        return pe;
    }

    public int getGolesfavor() {
        return gf;
    }

    public int getGolescontra() {
        return gc;
    }

    public int getTotalpartidos() {
        return tpa;
    }

    public int getTotalpuntos() {
        return tpu;
    }

    public void imprimirEquipo(){
        System.out.println(nombre + " " + pg + " " + pp + " " + pe + " " + gf + " " + gc + " " + tpa + " " + tpu);
    }
}

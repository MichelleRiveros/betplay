package com.campus;


public class Equipo {

    String nombre;
    int pg = 0; //Partidos Ganados
    int pp = 0; //Partidos Perdidos
    int pe = 0; //Partidos Empatados
    int gf = 0; //Goles a Favor
    int gc = 0; //Goles en Contra
    int tpa = 0; //Total de Partidos
    int tpu = 0; //Total de Puntos


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
}

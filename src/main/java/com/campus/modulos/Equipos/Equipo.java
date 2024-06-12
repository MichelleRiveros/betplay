package com.campus.modulos.Equipos;

import java.util.ArrayList;

import com.campus.modulos.CuerpoProfesionales.Profesional;
import com.campus.modulos.CuerpoTecnico.CuerpoTecnico;
import com.campus.modulos.Jugadores.Jugador;

public class Equipo {

    private String nombre;
    private int pg = 0; //Partidos Ganados
    private int pp = 0; //Partidos Perdidos
    private int pe = 0; //Partidos Empatados
    private int gf = 0; //Goles a Favor
    private int gc = 0; //Goles en Contra
    private int tpa = 0; //Total de Partidos
    private int tpu = 0; //Total de Puntos
    private ArrayList<Profesional> cuerpoMedico; 
    private ArrayList<CuerpoTecnico> cuerpoTecnico;
    private ArrayList<Jugador> jugadores; 

    public Equipo(){}

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

    public void agregarJugador(Jugador jugador1){
        
        if(determinarSiYaExisteElJugador(jugador1.getId())){
            System.out.println("El jugador ya existe");
        }else{
            jugadores.add(jugador1);
        }
    }

    public void agregarProfesional(Profesional profesional1){
        if(determinarSiYaExisteElProfesional(profesional1.getId())){
            System.out.println("El profesional ya existe");
        }else{
            cuerpoMedico.add(profesional1);
        }
    }
        
    public boolean determinarSiYaExisteElJugador(int id){

        if(jugadores.isEmpty()){       
            return true;
        }
        for (Jugador jugador : jugadores) {

            if(jugador.getId() == (id)){
                return true;   
            
            }
        }
        return false;
    }

    public boolean determinarSiYaExisteElProfesional (int id){
        if(cuerpoMedico.isEmpty()){
            return true;
        }
        for (Profesional profesional : cuerpoMedico) {
            if(profesional.getId() == (id)){
                return true;
            }
        }
        return false;
    }

    public void agregarTecnico(CuerpoTecnico tecnico){
        if(determinarSiYaExisteElJugador(tecnico.getId())){
            System.out.println("Ya esta registrada esta persona");
        }else {cuerpoTecnico.add(tecnico);}
    }

    public boolean determinarSiYaExisteElTecnico(int id){
        
        if(cuerpoTecnico.isEmpty()){
            return true;
        }
        for (Profesional profesional : cuerpoMedico) {
            if(profesional.getId() == (id)){
                return true;
            }    
        }
        return false;
    }
    
}

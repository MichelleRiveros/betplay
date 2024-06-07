package com.campus.modulos.Partidos;

import com.campus.modulos.Equipos.Equipo;

public class Partido {

    String fechaDelPartido;
    Equipo equipoLocal; 
    Equipo equipoVisitante; 
    int golesEquipoLocal;
    int golesEquipoVisitante;

    public Partido(){}

    public Partido(String fechaDelPartido, Equipo equipoLocal, Equipo equipoVisitante, int golesEquipoLocal, int golesEquipoVisitante){
        this.fechaDelPartido = fechaDelPartido;
        this.equipoLocal =  equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesEquipoLocal = golesEquipoLocal;
        this.golesEquipoVisitante = golesEquipoVisitante;
    }

    public void determinarGanador(int golesAfavorLocal, int golesAfavorVisitante){  

        int golesEL = this.golesEquipoLocal;
        int golesEV = this.golesEquipoVisitante;

        if (golesEL > golesEV){

            this.equipoLocal.gano();
            this.equipoVisitante.perdio();
        }

        else if (golesEV > golesEL){
            this.equipoVisitante.gano();
            this.equipoLocal.perdio();
        }

        else { 
            this.equipoVisitante.empato();
            this.equipoLocal.empato();
        }

        this.equipoLocal.setGolesAfavor(golesAfavorLocal);
        this.equipoLocal.setGolesEnContra(golesAfavorVisitante);
        this.equipoVisitante.setGolesAfavor(golesAfavorVisitante);
        this.equipoVisitante.setGolesEnContra(golesAfavorLocal);
    }


}

package com.campus;

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

    public void determinarGanador(){  

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

    }

    public void prueba(int golesEL, int golesEV, int equipoLocal, int equipoVisitante){

        int idEquipoLocal = equipoLocal;
        int idEquipoVisitante = equipoVisitante;

        if (golesEL > golesEV){

            System.out.println("Esoooo");
            System.out.println(golesEL);
            System.out.println(this.golesEquipoLocal);

            this.golesEquipoLocal += golesEL;


            System.out.println(idEquipoLocal);
            
            System.out.println(idEquipoVisitante);

            System.out.println(this.golesEquipoLocal);
            
        
        }

    }


    public void prueba1(){
        System.out.println(equipoLocal);
    }






}

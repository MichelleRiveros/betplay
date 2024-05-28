package com.campus;

import java.util.ArrayList;

public class ListaEquipo {

    ArrayList<Equipo> listaEquipo;

    public ListaEquipo(){
        this.listaEquipo = new ArrayList<>();
    }

    public void agregarEquipos(Equipo equipo){
        this.listaEquipo.add(equipo);
    }
    
    public void listarEquipos(){
        int temp = 0;

        for (Equipo equipo : listaEquipo) {
            System.out.println( temp + ". " + equipo);
            temp++;
        }
    }

    public Equipo getListaEquipo(int idEquipo){
        return listaEquipo.get(idEquipo);
    }

    public boolean ifExist(int id){

        if (id >= 0 && listaEquipo.size() > 0 && id < listaEquipo.size()){
            return true;
        }

        else{
            return false;
        }
    }

    public void equipoMasGoles(Equipo listaEquipo){
        
        Equipo nombre = getListaEquipo(0);

        for (Equipo equipo : this.listaEquipo) {
            if (equipo.getGolesfavor() > nombre.getGolesfavor()){
                nombre = equipo;
            }
            
        }
        System.out.println(nombre.getnombre());
    }

    
    public void equipoMasPuntos(Equipo listaEquipo){
        
        Equipo puntos = getListaEquipo(0);

        for (Equipo equipo : this.listaEquipo) {
            if (equipo.getTotalpuntos() > puntos.getTotalpuntos()){
                puntos = equipo;
            }
            
        }
        System.out.println(puntos.getnombre());
    }


}

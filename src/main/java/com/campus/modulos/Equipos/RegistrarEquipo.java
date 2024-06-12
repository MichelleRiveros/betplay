package com.campus.modulos.Equipos;
import java.util.ArrayList;
import java.util.Scanner;
import com.campus.modulos.Partidos.Partido;


public class RegistrarEquipo {

    ArrayList<Equipo> listaEquipo;


    public RegistrarEquipo(){
        this.listaEquipo = new ArrayList<>();
    }

    public void registrarEquipo(Scanner sc, ArrayList<Equipo> equiposDeFutbol){

        System.out.println("Ingrese el nombre del equipo");
        String nombreEquipo = sc.nextLine();

        while(determinarSiYaExisteElEquipo(nombreEquipo)){
                System.out.println("Ingrese el nombre del equipo");
                nombreEquipo = sc.nextLine();
        }

        Equipo equipo = new Equipo(nombreEquipo);
        agregarEquipos(equipo, equiposDeFutbol);
        System.out.println(String.format("El equipo %s ha sido agregado con exito", equipo.getnombre()));
        listarEquipos(equiposDeFutbol); 
    }

    public void agregarEquipos(Equipo equipo, ArrayList<Equipo> equiposDeFutbol){
        this.listaEquipo.add(equipo);
        equiposDeFutbol.add(equipo);
    }

    
    public void listarEquipos(ArrayList<Equipo> equiposDeFutbol){
        int temp = 0;

        for (Equipo equipo : listaEquipo) {
            System.out.println( temp + ". " + equipo.getnombre());
            temp++;
        }

        for (Equipo equipo : equiposDeFutbol) {
            System.out.println( temp + ". " + equipo.getnombre());
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

    public void equipoMasGoles(){
        
        Equipo nombre = getListaEquipo(0);

        for (Equipo equipo : this.listaEquipo) {
            if (equipo.getGolesfavor() > nombre.getGolesfavor()){
                nombre = equipo;
            }
            
        }
        System.out.println(nombre.getnombre());
    }
    
    public void equipoMasPuntos(){
        
        Equipo puntos = getListaEquipo(0);

        for (Equipo equipo : this.listaEquipo) {
            if (equipo.getTotalpuntos() > puntos.getTotalpuntos()){
                puntos = equipo;
            }
            
        }
        System.out.println(puntos.getnombre());
    }

    public void equipoMasPartidosGanados(){
        
        Equipo puntos = getListaEquipo(0);

        for (Equipo equipo : this.listaEquipo) {
            if (equipo.getpartidosganados() > puntos.getpartidosganados()){
                puntos = equipo;
            }
            
        }
        System.out.println(puntos.getnombre());
    }
    
    public void golesTotales(){
        
        int puntos = 0;

        for (Equipo equipo : this.listaEquipo) {
            puntos += equipo.getGolesfavor();
        }
        System.out.println(puntos);
    }

    public void promedio(ArrayList<Partido> partidos){
        
        int totalPartidos = partidos.size();
        int totalGoles = 0;
        int promedio = 0;

        for (Equipo equipo : listaEquipo) {
            totalGoles += equipo.getGolesfavor();
        }

        promedio = totalGoles/totalPartidos;
        System.out.println(promedio);
    }

    public void tabaPosiciones(){

        ArrayList<Equipo> tablaPosiciones = listaEquipo;
        
        for (Equipo equipo1 : tablaPosiciones) {
            
            for (Equipo equipo2 : tablaPosiciones) {
                
                if (equipo1.getTotalpuntos() < equipo2.getTotalpuntos()){
                    
                    Equipo temp = equipo1;
                    equipo1 = equipo2;
                    equipo2 = temp;
                }          
            }
        }
        
        for (Equipo equipo3 : tablaPosiciones) {
            equipo3.imprimirEquipo();
        }
    }

    public boolean determinarSiLaListaEstaLlena(){

        if(this.listaEquipo.isEmpty() && this.listaEquipo.size() < 2){
            return true;
        }

        else{
            return false;
        }
    }

    public boolean determinarSiYaExisteElEquipo(String nombre){
        for (Equipo equipo : listaEquipo) {
            if(equipo.getnombre().equalsIgnoreCase(nombre)){
                return true;   
            }
        }

        if(nombre.isEmpty()){
            return true;
        }
        return false;
    }

    public boolean verificarNumerodePartidos(){

        for (int i = 0; i < listaEquipo.size() - 1; i++) {
            
            if(listaEquipo.get(i).getTotalpartidos() != listaEquipo.get(i++).getTotalpartidos()){
                return false;
            }
        }

        return true;
    }

}

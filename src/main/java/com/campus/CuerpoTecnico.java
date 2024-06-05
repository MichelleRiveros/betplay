package com.campus;

public class CuerpoTecnico extends Persona {
    private String rol;


    public CuerpoTecnico(){}

    public CuerpoTecnico(int id, String nombre, String apellido, int edad, String nacionalidad, String rol){
         super(id, nombre, apellido, edad, nacionalidad);
         this.rol = rol;
    }

    public void setrol(String rol){
        this.rol = rol;
    }

    public String getrol(String rol){
        return this.rol;
    }
    
}

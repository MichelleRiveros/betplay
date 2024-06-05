package com.campus;

public class Profesional extends Persona {
    String titulo;
    String tarjetaProfesional;
    String experiencia;

    public Profesional (){}

    public Profesional(int id, String nombre, String apellido, int edad, String nacionalidad, String titulo, String tarjetaProfesoinal, String experiencia){
        super(id, nombre, apellido, edad, nacionalidad);
        this.titulo = titulo;
        this.tarjetaProfesional = tarjetaProfesoinal;
        this.experiencia = experiencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTarjetaProfesional(String tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
}


package com.campus.modulos.CuerpoProfesionales;
import java.util.Scanner;

import com.campus.modulos.Persona;

public class Profesional extends Persona {
    String titulo;
    String tarjetaProfesional;
    String experiencia;

    public Profesional() {
    }

    public Profesional(int id, String nombre, String apellido, int edad, String nacionalidad, String titulo,
            String tarjetaProfesoinal, String experiencia) {
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

    public Profesional registrarProfesional() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese ID del profesional");
        int idProfesional = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese nombre del profesional");
        String nombreProfesional = sc.nextLine();

        System.out.println("Ingrese apellido del profesional");
        String apellidoProfesional = sc.nextLine();

        System.out.println("Ingrese edad del profesional");
        int edadProfesional = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese nacionalidad del profesional");
        String nacionalidadProfesional = sc.nextLine();

        System.out.println("Ingrese titulo del profesoinal");
        String tituloProfesional = sc.nextLine();

        System.out.println("Ingrese la tarjeta del profesoinal");
        String tarjetaProfesoinal = sc.nextLine();

        System.out.println("Ingrese la experiencia del profesional");
        String experienciaDelProfesional = sc.nextLine();

        Profesional profesional1 = new Profesional(idProfesional,nombreProfesional,apellidoProfesional,edadProfesional,nacionalidadProfesional, tituloProfesional,tarjetaProfesoinal,experienciaDelProfesional);
        sc.close();
        return profesional1;
    }
}

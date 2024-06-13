package com.campus.modulos.CrudJSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public abstract class ManejoDeDAO<T> implements InterfaceDAO<T>{
    private final String filePath; //Ruta
    private final Gson gson; //Archivo al que se va a convertir
    private final Type listType; //Lista

    public ManejoDeDAO(String filePath, Type listType){ //constructor
        this.filePath = filePath;
        this.gson = new Gson(); //PREGUNTARLE A BUSTA
        this.listType = listType;
    }

    @Override
    public List<T> leerTodos(){
        try (Reader reader = new FileReader(filePath)) { //filePath es el destino donde va la informacion
            //PREGUNTARLE A BUSTA
            return gson.fromJson(reader, listType); //PREGUNTARLE A BUSTA
        } catch (FileNotFoundException e) {
            return new ArrayList<>(); //Si el archivo no existe, devolver una lista vacia
        } catch (IOException e){
            //PREGUNTARLE A BUSTA
            return new ArrayList<>();
        }
    }

    @Override
    public void escribirTodos(List<T> elementos) { //Guardar
        try (Writer writer = new FileWriter(filePath)) {
            gson.toJson(elementos, writer); //PREGUNTARLE A BUSTA
        } catch (IOException e) {
            e.printStackTrace(); //PREGUNTARLE A BUSTA
        }
    }

    @Override
    public void agregar(T elemento) {
        List<T> elementos = leerTodos();
        elementos.add(elemento);
        escribirTodos(elementos);
    }

    @Override
    public void actualizar(T elemento) {
        List<T> elementos = leerTodos();
        for (int i = 0; i < elementos.size(); i++) {
            if (getId(elementos.get(i)) == getId(elemento)) {
                elementos.set(i, elemento); //PREGUNTAR A BUSTA
                break;
            }
        }
        escribirTodos(elementos);
    }

    @Override
    public void eliminar(int id) {
        List<T> elementos = leerTodos();
        elementos.removeIf(e -> getId(e) == id);
        escribirTodos(elementos);
    }

    @Override
    public T obtenerPorId(int id) {
        List<T> elementos = leerTodos(); //PREGUNTAR A BUSTA
        for (T elemento : elementos) {
            if (getId(elemento) == id) {
                return elemento;
            }
        }
        return null;
    }

    protected abstract int getId(T elemento); //PREGUNTAR A BUSTA
}

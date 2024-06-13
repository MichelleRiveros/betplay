package com.campus.modulos.CrudJSON;
import java.util.List;

public interface InterfaceDAO<T> {
        List<T> leerTodos(); //Metodo para leer la lista del tipo T
        void escribirTodos(List<T> elementos); //elementos es una lista (List<T>) de todos los objetos que se desean guardar.
        void agregar(T elemento); //elemento es el objeto de tipo T que se desea agregar.
        void actualizar(T elemento);
        void eliminar(int id);
        T obtenerPorId(int id);

        /*Propósito: Este método se utiliza para obtener un objeto específico de tipo T desde el almacenamiento basado en su identificador único (id).
        Retorno: Un objeto de tipo T que corresponde al identificador proporcionado, o null si no se encuentra.
        Parámetro: id es un valor entero que identifica el objeto que se desea obtener.
        Uso: Se llama a este método para recuperar un registro específico utilizando su identificador único.*/
}

/*InterfaceDAO es una interfaz generica donde "T" es un parametro de tipo.
Esto es para que pueda utilizar esra interfaz con cualquier clase de objeto
 ya sea "Equipo", "Jugador", etc.. */

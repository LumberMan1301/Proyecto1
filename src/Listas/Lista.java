package Listas;

import Nodo.Nodo;

/**
 * clase Principal de Listas
 */

public abstract class Lista<T> {
    /**
     * atributos de la clase lista, uno de Tipo Nodo para almacenar informacion, y otro de tipo Int para hacer
     * un "indice"
     */
    private Nodo primero;
    private int capacidad;

    /**
     * constructor de la clase lista
     */
    public Lista() {
        this.capacidad=0;
        this.primero = null;
    }

    


}

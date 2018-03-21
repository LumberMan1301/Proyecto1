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
    private Nodo referencia;
    private int capacidad;

    /**
     * constructor de la clase lista
     */
    public Lista() {
        this.capacidad=0;
        this.referencia = null;
    }

    /**
     * metodo para revisar si la lista esta vacia
     */
    public boolean estaVacia(){
        if (this.capacidad==0)
            return true;
        else
            return false;
    }

    /**
     * metodo para comprobar si un nodo Existe
     */
    public boolean existe(Nodo nodo){
        if (estaVacia()){
            return false;
        }else{
            Nodo aux = this.referencia;
            while(aux != null){
                if(aux.getDato().equals(nodo.getDato()))
                    return true;
                else
                    aux=aux.getSiguiente();
            }return false;
        }
    }

    /**
     * metodo para agregar al final de la lista
     */
    public void agregar(Nodo nodo){

    }
}

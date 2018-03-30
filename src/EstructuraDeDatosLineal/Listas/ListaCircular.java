package EstructuraDeDatosLineal.Listas;

import EstructuraDeDatosLineal.Nodo.Nodo;

/**
 * Clase de la Lista Circular, subclase de Lista
 * @param <T>
 */
public class ListaCircular <T> extends Lista {

    /**
     * atributo particular de la clase Circular, referencia al ultimo nodo
     */
    private Nodo ultimo;

    /**
     * Constructor de la clase
     */
    public ListaCircular() {
        super();
        this.ultimo= this.primero;
    }


}

package EstructuraDeDatosLineal.Listas;

import EstructuraDeDatosLineal.Nodo.Nodo;

/**
 * clase Principal de EstructuraDeDatosLineal.Listas
 */

public class Lista<T> {
    /**
     * atributos de la clase lista, uno de Tipo EstructuraDeDatosLineal.Nodo para almacenar informacion, y otro de tipo Int para hacer
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
        if (this.estaVacia()){
            return false;
        }else{
            Nodo aux = this.primero;
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
    public void agregar(T data){
        Nodo nodo = new Nodo(data);
        if (this.estaVacia()) {
            this.primero = nodo;
            this.capacidad += 1;

        }else{
            Nodo aux = this.primero;
            while(aux.getSiguiente()!=null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nodo);
        }

    }

    /**
     * metodo para imprimir la Lista
     */
    public void imprimirL(){
        if(this.estaVacia())
            System.out.println("La Lista Esta Vacia");
        else {
            Nodo aux = this.primero;
            while (aux!=null){
                System.out.println(aux.getDato());
                aux=aux.getSiguiente();

            }
        }
    }
}

import EstructuraDeDatosLineal.Listas.Lista;
import EstructuraDeDatosLineal.Listas.ListaDoble;

public class Main {
    public static void main (String [] args){
        Lista l1 = new Lista();
        l1.agregar("mariano");
        l1.agregar("karla");
        l1.imprimirL();

        ListaDoble ld1 = new ListaDoble();
        ld1.agregar("maria");
        ld1.agregar("steven");
        ld1.imprimirL();



    }
}

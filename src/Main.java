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
        ld1.getCapacidad();

        Lista l2 = new Lista();
        l2.agregar(1);
        l2.agregar(2);
        l2.agregar(3);
        l2.agregar(4);
        l2.imprimirL();
        //l2.eliminar(2);
        l2.imprimirL();
        l2.agregar(7);
        l2.imprimirL();
        l2.eliminarDato(8);
        l2.imprimirL();




    }
}

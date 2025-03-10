package Pruebas;
//Carlos Clark WHITEWOLF
import LinkedList.LinkedList;

/**
 * Clase destinada a probar la implementación de la lista enlazada simple.
 *
 * Se llevan a cabo operaciones de inserción, eliminación, búsqueda y limpieza 
 * para comprobar que la estructura de datos funciona correctamente.
 */
public class Pruebas {

    /**
     * Método principal que ejecuta las pruebas de la lista enlazada.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en esta prueba).
     */
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();

        // Comprobar si la lista está vacía
        System.out.println("¿La lista está vacía?: " + lista.isEmpty());

        // Añadir elementos a la lista
        lista.addFirst(10);
        lista.addLast(20);
        lista.addLast(30);
        System.out.println("Lista después de agregar elementos: " + lista);

        // Consultar datos de la lista
        System.out.println("Número de elementos en la lista: " + lista.size());
        System.out.println("¿La lista contiene el número 20?: " + lista.contains(20));
        System.out.println("Valor en la posición 1: " + lista.getElement(1));

        // Eliminar elementos de la lista
        lista.removeFirst();
        System.out.println("Lista después de eliminar el primer elemento: " + lista);
        lista.removeLast();
        System.out.println("Lista después de eliminar el último elemento: " + lista);

        // Vaciar completamente la lista
        lista.clear();
        System.out.println("Lista después de eliminar todos los elementos: " + lista);
    }
}

package LinkedList;
//CarlosClark WHITEWOLF
public class LinkedList {

    private Nodo inicial; // Nodo que marca el inicio de la lista
    private int tam; // Número de elementos en la lista

/**
 * Constructor que inicializa una lista enlazada vacía.
 */
public LinkedList() {
    this.inicial = null;
    this.tam = 0;
}

/**
 * Comprueba si la lista no contiene elementos.
 *
 * @return true si la lista está vacía, de lo contrario false.
 */
public boolean isEmpty() {
    return inicial == null;
}

/**
 * Devuelve la cantidad de elementos en la lista.
 *
 * @return El tamaño actual de la lista.
 */
public int size() {
    return tam;
}

/**
 * Inserta un nuevo elemento al comienzo de la lista.
 *
 * @param dato Valor a añadir.
 * @pre El valor debe ser un número entero válido.
 * @post Se agregará un nuevo nodo al inicio de la lista.
 */
public void addFirst(int dato) {
    Nodo nuevo = new Nodo(dato);
    nuevo.siguiente = inicial;
    inicial = nuevo;
    tam++;
}

/**
 * Inserta un nuevo elemento al final de la lista.
 *
 * @param dato Valor a añadir.
 * @pre El valor debe ser un número entero válido.
 * @post Se incorporará un nuevo nodo al final de la lista.
 */
public void addLast(int dato) {
    Nodo nuevo = new Nodo(dato);
    if (isEmpty()) {
        inicial = nuevo;
    } else {
        Nodo actual = inicial;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }
    tam++;
}

/**
 * Elimina el primer nodo de la lista.
 *
 * @pre La lista debe contener al menos un elemento.
 * @post Se eliminará el nodo que ocupa la primera posición.
 */
public void removeFirst() {
    if (!isEmpty()) {
        inicial = inicial.siguiente;
        tam--;
    }
}

/**
 * Elimina el último nodo de la lista.
 *
 * @pre La lista no debe estar vacía.
 * @post Se removerá el nodo que se encuentra al final.
 */
public void removeLast() {
    if (!isEmpty()) {
        if (inicial.siguiente == null) {
            inicial = null;
        } else {
            Nodo actual = inicial;
            while (actual.siguiente.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = null;
        }
        tam--;
    }
}

/**
 * Busca un valor dentro de la lista.
 *
 * @param dato Valor a buscar.
 * @return true si el valor está presente en la lista, false en caso contrario.
 */
public boolean contains(int dato) {
    Nodo actual = inicial;
    while (actual != null) {
        if (actual.dato == dato) {
            return true;
        }
        actual = actual.siguiente;
    }
    return false;
}

/**
 * Obtiene el valor de un nodo en una posición específica.
 *
 * @param index Posición del elemento deseado (debe estar en el rango válido).
 * @return El valor del nodo en la posición indicada o -1 si el índice es inválido.
 * @pre El índice debe estar dentro de los límites de la lista.
 * @post La lista permanecerá inalterada, solo se devolverá el valor del nodo solicitado.
 */
public int getElement(int index) {
    if (index < 0 || index >= tam) {
        return -1;
    }
    Nodo actual = inicial;
    for (int i = 0; i < index; i++) {
        actual = actual.siguiente;
    }
    return actual.dato;
}

/**
 * Elimina todos los nodos de la lista, dejándola vacía.
 *
 * @post La lista no contendrá elementos después de la operación.
 */
public void clear() {
    inicial = null;
    tam = 0;
}

/**
 * Genera una representación en texto de la lista enlazada.
 *
 * @return Una cadena con los valores de la lista en formato [valor1, valor2, ...].
 */
@Override
public String toString() {
    StringBuilder sb = new StringBuilder("[");
    Nodo actual = inicial;
    while (actual != null) {
        sb.append(actual.dato);
        if (actual.siguiente != null) {
            sb.append(", ");
        }
        actual = actual.siguiente;
    }
    sb.append("]");
    return sb.toString();
}
}

/**
 * Clase que define un nodo en la lista enlazada.
 */
class Nodo {

    int dato; // Valor almacenado en el nodo
    Nodo siguiente; // Puntero al siguiente nodo en la lista

    /**
     * Constructor que inicializa un nodo con un valor específico.
     *
     * @param dato Valor a almacenar en el nodo.
     */
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
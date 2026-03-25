class Nodo {
    String nombre;
    Nodo siguiente;

    public Nodo(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;
    }
}

public class ListaEnlazada {
    public static void main(String[] args) {
        // 1. Creación de nodos
        Nodo nodo1 = new Nodo("Fernando");
        Nodo nodo2 = new Nodo("Luis");
        Nodo nodo3 = new Nodo("María");
        Nodo nodo4 = new Nodo("Paula");

        // 2. Enlazado manual (Punteros)
        nodo1.siguiente = nodo2;
        nodo2.siguiente = nodo3;
        nodo3.siguiente = nodo4;

        // 3. Definir el inicio de la lista
        Nodo cabeza = nodo1;

        // 4. Recorrido
        Nodo actual = cabeza;
        while (actual != null) {
            String siguienteNombre = (actual.siguiente != null) 
                ? actual.siguiente.nombre 
                : "null";

            System.out.println("[" + actual.nombre + " | siguiente -> " + siguienteNombre + "]");
            actual = actual.siguiente;
        }
        /*
La lista enlazada es dinámica porque su tamaño puede crecer o disminuir según sea necesario.
No requiere un espacio de memoria fijo al inicio como los arreglos.
Cada nodo se conecta mediante referencias al siguiente elemento.
Esto permite insertar o eliminar datos fácilmente sin reorganizar toda la estructura.
Por ello, es eficiente cuando se trabaja con cantidades de datos variables.
*/
         System.out.println("\nExplicación:");
        System.out.println("La lista enlazada es dinámica porque su tamaño puede crecer o disminuir según sea necesario.");
        System.out.println("No requiere un espacio de memoria fijo al inicio como los arreglos.");
        System.out.println("Cada nodo se conecta mediante referencias al siguiente elemento.");
        System.out.println("Esto permite insertar o eliminar datos fácilmente sin reorganizar toda la estructura.");
        System.out.println("Por ello, es eficiente cuando se trabaja con cantidades de datos variables.");
    }
}
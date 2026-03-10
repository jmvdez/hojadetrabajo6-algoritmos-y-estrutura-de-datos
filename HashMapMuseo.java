public class HashMapMuseo {

    private Nodo[] tabla;
    private int tamaño = 20;

    public HashMapMuseo() {
        tabla = new Nodo[tamaño];
    }

    // Funcion HASH
   public int generarHash(String clave) {

        int hash = 0;

        for (int i = 0; i < clave.length(); i++) {
            hash = 31 * hash + clave.charAt(i);
        }

    return Math.abs(hash) % tamaño;
    }

    // INSERTAR
    public void insertar(String clave, ObraArte valor) {

        int indice = generarHash(clave);

        Nodo nuevo = new Nodo(clave, valor);

        if (tabla[indice] == null) {
            tabla[indice] = nuevo;
        } 
        else {

            Nodo actual = tabla[indice];

            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
        }
    }

    // BUSCAR
    public ObraArte buscar(String clave) {

        int indice = generarHash(clave);

        Nodo actual = tabla[indice];

        while (actual != null) {

            if (actual.clave.equals(clave)) {
                return actual.valor;
            }

            actual = actual.siguiente;
        }

        return null;
    }

    // MOSTRAR TABLA
    public void mostrar() {

        for (int i = 0; i < tamaño; i++) {

            Nodo actual = tabla[i];

            if (actual != null) {

                System.out.println("Indice " + i + ":");

                while (actual != null) {

                    System.out.println("   " + actual.valor);

                    actual = actual.siguiente;
                }
            }
        }
    }
}

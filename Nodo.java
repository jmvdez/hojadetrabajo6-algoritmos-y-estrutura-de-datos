public class Nodo {

    String clave;
    ObraArte valor;
    Nodo siguiente;

    public Nodo(String clave, ObraArte valor) {
        this.clave = clave;
        this.valor = valor;
        this.siguiente = null;
    }
}

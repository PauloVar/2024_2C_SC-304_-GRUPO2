package n4.proyectofinal;

public class NodoArbol { // un nodo del arbol binario
    private Partido partido;
    private NodoArbol izquierdo;
    private NodoArbol derecho;

    public NodoArbol(Partido partido) {
        this.partido = partido;
        this.izquierdo = null;
        this.derecho = null;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public NodoArbol getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoArbol izquierda) {
        this.izquierdo = izquierdo;
    }

    public NodoArbol getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoArbol derecha) {
        this.derecho = derecho;
    }
}

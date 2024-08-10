package n4.proyectofinal;

public class PilaResultados {
    
    private NodoResultado cima;

    public PilaResultados() {
        this.cima = null;
    }

    public void apilar(int resultadoEquipoA, int resultadoEquipoB) {
        NodoResultado nuevoNodo = new NodoResultado(resultadoEquipoA, resultadoEquipoB);
        if (estaVacia()){
            cima = nuevoNodo;
        }
        else {
            nuevoNodo.setSiguiente(cima);
            cima = nuevoNodo;
        }
    }

    public NodoResultado desapilar() {
        if (cima == null) {
            return null; // La pila está vacía
        }
        NodoResultado resultado = cima;
        cima = cima.getSiguiente();
        return resultado;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public void listarResultados() {
        
        NodoResultado actual = cima;
        StringBuilder sb = new StringBuilder();

        if (actual == null) {
            sb.append("No hay resultados en la pila.");
        } else {
            while (actual != null) {
                sb.append("Resultado: ")
                  .append(actual.getResultadoEquipoA())
                  .append(" - ")
                  .append(actual.getResultadoEquipoB())
                  .append("\n");
                actual = actual.getSiguiente();
            }
        }
        System.out.println(sb.toString());
    }
}

package Ciudad.Grafo;

/** Nodo del grafo que identifica un lugar en la ciudad. */

public class Node {
    private final String nombre;

    public Node(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

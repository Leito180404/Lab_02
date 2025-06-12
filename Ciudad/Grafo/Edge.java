package Ciudad.Grafo;

/** Arista que une dos nodos con un peso. */

public class Edge {
    private final Node destino;
    private final double peso;

    public Edge(Node destino, double peso) {
        this.destino = destino;
        this.peso = peso;
    }

    public Node getDestino() {
        return destino;
    }

    public double getPeso() {
        return peso;
    }
}

package Ciudad.Grafo;

/** Grafo dirigido simple para las calles de la ciudad. */

import java.util.*;

public class Grafo {
    private final Map<Node, List<Edge>> adyacencias = new HashMap<>();

    public void agregarNodo(Node nodo) {
        adyacencias.putIfAbsent(nodo, new ArrayList<>());
    }

    public void agregarArista(Node origen, Node destino, double peso) {
        adyacencias.get(origen).add(new Edge(destino, peso));
    }

    public List<Node> obtenerNodos() {
        return new ArrayList<>(adyacencias.keySet());
    }

    public List<Edge> obtenerAristas(Node nodo) {
        return adyacencias.getOrDefault(nodo, Collections.emptyList());
    }
}

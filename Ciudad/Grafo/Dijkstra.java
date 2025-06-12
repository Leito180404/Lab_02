package Ciudad.Grafo;

import java.util.*;

/**
 * Calcula rutas mas cortas en el grafo usando el algoritmo de Dijkstra.
 */
public class Dijkstra {
    private final Grafo grafo;

    public Dijkstra(Grafo grafo) {
        this.grafo = grafo;
    }

    public List<Node> calcularRuta(Node inicio, Node fin) {
        Map<Node, Double> dist = new HashMap<>();
        Map<Node, Node> prev = new HashMap<>();
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingDouble(dist::get));

        for (Node n : grafo.obtenerNodos()) {
            dist.put(n, Double.POSITIVE_INFINITY);
            prev.put(n, null);
        }
        dist.put(inicio, 0.0);
        pq.add(inicio);

        while (!pq.isEmpty()) {
            Node actual = pq.poll();
            if (actual.equals(fin)) break;
            for (Edge e : grafo.obtenerAristas(actual)) {
                double alt = dist.get(actual) + e.getPeso();
                if (alt < dist.get(e.getDestino())) {
                    dist.put(e.getDestino(), alt);
                    prev.put(e.getDestino(), actual);
                    pq.add(e.getDestino());
                }
            }
        }

        List<Node> ruta = new ArrayList<>();
        Node paso = fin;
        while (paso != null) {
            ruta.add(0, paso);
            paso = prev.get(paso);
        }
        return ruta;
    }
}

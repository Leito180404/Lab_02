package Ciudad;

import Ciudad.Grafo.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import Ciudad.LocationIndex;

public class Loader {
    public static void cargarGrafo(Grafo grafo, InputStream in) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 3) {
                Node origen = new Node(parts[0]);
                Node destino = new Node(parts[1]);
                grafo.agregarNodo(origen);
                grafo.agregarNodo(destino);
                double peso = Double.parseDouble(parts[2]);
                grafo.agregarArista(origen, destino, peso);
            }
        }
    }

    public static void cargarGrafo(Grafo grafo, LocationIndex index, InputStream in) throws IOException {
        cargarGrafo(grafo, in);
        for (Node n : grafo.obtenerNodos()) {
            index.addLocation(new Location(n.getNombre(), 0, 0));
        }
    }
}

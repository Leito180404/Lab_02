package Ciudad;

/** Utiliza un B+ tree para indexar nombres de ubicaciones. */

import Ciudad.BPlus.BPlusTree;
import Ciudad.Grafo.Node;

public class LocationIndex {
    private final BPlusTree tree = new BPlusTree(3);

    public void addLocation(Location loc) {
        tree.insertar(loc.getNombre());
    }

    public boolean contains(String nombre) {
        return tree.contiene(nombre);
    }
}

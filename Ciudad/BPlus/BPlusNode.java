package Ciudad.BPlus;

/** Nodo basico del arbol B+. */

import java.util.ArrayList;
import java.util.List;

public class BPlusNode {
    private final List<String> claves = new ArrayList<>();
    private final List<BPlusNode> hijos = new ArrayList<>();
    private boolean hoja = true;

    public List<String> getClaves() {
        return claves;
    }

    public List<BPlusNode> getHijos() {
        return hijos;
    }

    public boolean esHoja() {
        return hoja;
    }

    public void setHoja(boolean hoja) {
        this.hoja = hoja;
    }
}

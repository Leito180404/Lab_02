package Ciudad.BPlus;

/** Arbol B+ simplificado solo para demostracion. */

public class BPlusTree {
    private final int orden;
    private BPlusNode raiz;

    public BPlusTree(int orden) {
        this.orden = orden;
        this.raiz = new BPlusNode();
    }

    public void insertar(String clave) {
        // Implementacion simplificada
        raiz.getClaves().add(clave);
        raiz.getClaves().sort(String::compareTo);
    }

    public boolean contiene(String clave) {
        return raiz.getClaves().contains(clave);
    }

    public BPlusNode getRaiz() {
        return raiz;
    }
}

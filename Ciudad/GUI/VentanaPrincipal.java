package Ciudad.GUI;

/** Ventana principal con controles de busqueda de rutas. */

import Ciudad.Grafo.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;

public class VentanaPrincipal extends JFrame {
    private final Grafo grafo;
    private final Dijkstra dijkstra;
    private final Ciudad.LocationIndex index;
    private final JTextField origenCampo = new JTextField(10);
    private final JTextField destinoCampo = new JTextField(10);
    private final JTextArea resultadoArea = new JTextArea(5, 20);
    private final JTextField consultaCampo = new JTextField(10);

    public VentanaPrincipal(Grafo grafo, Ciudad.LocationIndex index) {
        super("Rutas de Ciudad");
        this.grafo = grafo;
        this.dijkstra = new Dijkstra(grafo);
        this.index = index;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.add(new JLabel("Origen:"));
        panel.add(origenCampo);
        panel.add(new JLabel("Destino:"));
        panel.add(destinoCampo);
        panel.add(new JLabel("Consulta:"));
        panel.add(consultaCampo);
        JButton buscar = new JButton("Buscar Ruta");
        buscar.addActionListener(this::buscarRuta);
        panel.add(buscar);
        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(resultadoArea), BorderLayout.CENTER);
        pack();
    }

    private void buscarRuta(ActionEvent e) {
        Node origen = new Node(origenCampo.getText());
        Node destino = new Node(destinoCampo.getText());
        grafo.agregarNodo(origen);
        grafo.agregarNodo(destino);
        index.addLocation(new Ciudad.Location(origen.getNombre(),0,0));
        index.addLocation(new Ciudad.Location(destino.getNombre(),0,0));
        List<Node> ruta = dijkstra.calcularRuta(origen, destino);
        resultadoArea.setText("");
        for (Node n : ruta) {
            resultadoArea.append(n.getNombre() + "\n");
        }
        if (!consultaCampo.getText().isEmpty()) {
            boolean esta = index.contains(consultaCampo.getText());
            resultadoArea.append("En indice: " + esta + "\n");
        }
    }
}

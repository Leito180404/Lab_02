package Ciudad;

/** Punto de entrada para la aplicacion de ciudad. */

import Ciudad.Grafo.*;
import Ciudad.GUI.VentanaPrincipal;
import java.io.IOException;
import java.io.InputStream;

import Ciudad.LocationIndex;

import javax.swing.*;

public class RunApp {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        LocationIndex index = new LocationIndex();
        try (InputStream in = RunApp.class.getResourceAsStream("/Ciudad/ciudad.txt")) {
            if (in != null) {
                Loader.cargarGrafo(grafo, index, in);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> new VentanaPrincipal(grafo, index).setVisible(true));
    }
}

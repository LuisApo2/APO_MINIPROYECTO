package UI;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("Colección Música");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Creación y asignación directa de paneles.
        add(new PanelPlaylists(), BorderLayout.WEST);
        add(new PanelArtistas(), BorderLayout.CENTER);
        add(new PanelCanciones(), BorderLayout.EAST);
    }
}

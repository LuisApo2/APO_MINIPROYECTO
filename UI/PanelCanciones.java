package UI;

import javax.swing.*;
import java.awt.*;

public class PanelCanciones extends JPanel {
    private DefaultListModel<Model.Cancion> songModel;

    public PanelCanciones() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createTitledBorder("Canciones"));

        songModel = new DefaultListModel<>();
        JList<Model.Cancion> songList = new JList<>(songModel);
        JScrollPane scrollPane = new JScrollPane(songList);
        add(scrollPane, BorderLayout.CENTER);
    }
}


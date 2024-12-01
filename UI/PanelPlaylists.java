package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPlaylists extends JPanel {
    private DefaultListModel<Model.ListaReproduccion> playlistModel;

    public PanelPlaylists() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createTitledBorder("Playlists"));

        playlistModel = new DefaultListModel<>();
        JList<Model.ListaReproduccion> playlistList = new JList<>(playlistModel);
        JScrollPane scrollPane = new JScrollPane(playlistList);
        add(scrollPane, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        JTextField playlistNameField = new JTextField(10);
        JButton addButton = new JButton("Crear");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = playlistNameField.getText().trim();
                if (!name.isEmpty()) {
                    playlistModel.addElement(new Model.ListaReproduccion(name));
                    playlistNameField.setText("");
                }
            }
        });
        bottomPanel.add(playlistNameField);
        bottomPanel.add(addButton);
        add(bottomPanel, BorderLayout.SOUTH);
    }
}

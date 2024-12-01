package UI;

import javax.swing.*;
import java.awt.*;

public class PanelArtistas extends JPanel {
    public PanelArtistas() {
        setLayout(new GridLayout(3, 2));
        setBorder(BorderFactory.createTitledBorder("Artistas"));

        JLabel nameLabel = new JLabel("Nombre:");
        JTextField nameField = new JTextField();
        JLabel countryLabel = new JLabel("País:");
        JTextField countryField = new JTextField();
        JButton saveButton = new JButton("Guardar");

        saveButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            String country = countryField.getText().trim();
            if (!name.isEmpty() && !country.isEmpty()) {
                Model.Artista artista = new Model.Artista(name, country);
                JOptionPane.showMessageDialog(this, "Artista guardado: " + artista);
                nameField.setText("");
                countryField.setText("");
            }
        });

        add(nameLabel);
        add(nameField);
        add(countryLabel);
        add(countryField);
        add(new JLabel());
        add(saveButton);
    }
}

package Collaborative_IDE;

import Collaborative_IDE.View.View;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new View();  // Create an instance of the View to display the GUI
        });
    }
}

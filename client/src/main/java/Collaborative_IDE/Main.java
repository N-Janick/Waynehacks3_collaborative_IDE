package Collaborative_IDE;

import Collaborative_IDE.Controller.Controller;
import Collaborative_IDE.View.View;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            View view = new View();
            Controller controller = new Controller(view);
        });
    }
}

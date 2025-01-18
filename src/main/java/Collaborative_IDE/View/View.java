package Collaborative_IDE.View;

import Collaborative_IDE.Controller.Controller;

import javax.swing.*;
import java.awt.*;

public class View {

    // attriburtes
    JFrame frame;

    Controller controller;

    public View() {
        frame = new JFrame("WayneHacks3 Project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        //frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        JTextField meetingIdField = new JTextField("Enter meeting ID");
        JButton enterButton = new JButton("Join Meeting");

        JPanel enterPanel = new JPanel();

        enterPanel.setBorder(BorderFactory.createTitledBorder("Join Meeting"));
        enterPanel.setLayout(new FlowLayout());
        //enterPanel.setLayout(new BoxLayout(enterPanel, BoxLayout.Y_AXIS));
        //enterPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        enterPanel.setPreferredSize(new Dimension(200, 100));
        enterPanel.add(meetingIdField);
        enterPanel.add(enterButton);

        frame.add(enterPanel, BorderLayout.CENTER);
        //frame.add(enterPanel);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null); // sets frame location to the center of the screen
        frame.setVisible(true);

        controller = new Controller(this);

    }
}

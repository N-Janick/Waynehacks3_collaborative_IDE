package Collaborative_IDE.Controller;

import Collaborative_IDE.View.View;

import javax.management.remote.JMXConnectorFactory;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    // attributes
    View view;



    public Controller(View view) {
        this.view = view;

        view.getEnterButton().addActionListener(e -> startMeeting());
    }

    void startMeeting() {
        System.out.println("Starting Meeting");
        this.view.getEnterButton().removeActionListener(e -> startMeeting());
        this.view.startMeeting();
        this.view.getStartChatButton().addActionListener(e -> startChat());
        this.view.getStartIdeButton().addActionListener(e -> startIde());
        this.view.getLeaveMeetingButton().addActionListener(e -> leaveMeeting());

    }

    private void startChat() {
       System.out.println("Starting Chat");
        this.view.startChat();
    }

    private void startIde() {
        System.out.println("Starting Ide");
        this.view.startIde();
    }

    private void leaveMeeting() {
        System.out.println("Leaving Meeting");
        this.view.leaveMeeting();
    }






}

/*
// Junk code not being used
 // ************** Listener Classes *********************
    class EnterButtonListener implements ActionListener {
        private Controller controller;

        public EnterButtonListener(Controller controller) {
            this.controller = controller;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Meeting Started");
            controller.view.getEnterButton().removeActionListener(this);
            controller.view.setUpMeeting();

        }
    }
 */

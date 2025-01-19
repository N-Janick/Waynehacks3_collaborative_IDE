package Collaborative_IDE.View;

import Collaborative_IDE.Controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View {

    // attributes
    JFrame frame;

    // components for initial view screen
    JPanel wrapperPanel;
    JPanel enterPanel;
    JButton enterButton;
    JTextField meetingIdField;

    // components for meeting view
    JPanel meetingControlBar;
    JButton startChatButton;
    JButton startIdeButton;
    JButton leaveMeetingButton;

    // components for Panel that will hold IDE
    JPanel idePanel;
    JPanel editorPanel;
    JPanel outputPanel;
    JPanel editorControlBar;
    JButton newFileButton;
    JButton openFileButton;

    // components for Panel that will contain chat content
    JPanel chatPanel;

    public View() {
        frame = new JFrame("WayneHacks3 Project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // initialize the meeting ID enter panel
        enterPanel = new JPanel();

        enterPanel.setBorder(BorderFactory.createTitledBorder("Join Meeting"));
        enterPanel.setLayout(new BoxLayout(enterPanel, BoxLayout.Y_AXIS));
        enterPanel.setPreferredSize(new Dimension(200, 75));
        enterPanel.setAlignmentY(Component.CENTER_ALIGNMENT);
        wrapperPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        wrapperPanel.add(enterPanel);
        meetingIdField = new JTextField("Enter meeting ID");
        meetingIdField.setAlignmentX(Component.CENTER_ALIGNMENT);
        enterButton = new JButton("Join Meeting");
        enterButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        enterPanel.add(meetingIdField);
        enterPanel.add(enterButton);

        frame.add(wrapperPanel, BorderLayout.CENTER);
        //frame.add(enterPanel);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null); // sets frame location to the center of the screen
        frame.setVisible(true);
    }

    // method to remove Panels for initial screen and initialize meeting view
    public void setUpMeeting() {
        frame.remove(wrapperPanel);
        wrapperPanel = null;

    }

    // method to set up meetingControlsPanel
    public void startMeeting() {
        frame.remove(wrapperPanel);
        wrapperPanel = null;
        meetingControlBar = new JPanel(new FlowLayout(FlowLayout.CENTER));
        startChatButton = new JButton("Start Chat");
        meetingControlBar.add(startChatButton);
        startIdeButton = new JButton("Start Ide");
        meetingControlBar.add(startIdeButton);
        leaveMeetingButton = new JButton("Leave Meeting");
        meetingControlBar.add(leaveMeetingButton);
        frame.add(meetingControlBar, BorderLayout.NORTH);
        frame.revalidate();
        frame.repaint();

    }

    public void startChat() {

    }

    public void startIde() {

    }

    public void leaveMeeting() {
        // open a popup asking if you want to download copy of the file
    }

    // *********************** getter methods ********************

    public JFrame getFrame() {
        return frame;
    }

    public JPanel getWrapperPanel() {
        return wrapperPanel;
    }

    public JPanel getEnterPanel() {
        return enterPanel;
    }

    public JButton getEnterButton() {
        return enterButton;
    }

    public JTextField getMeetingIdField() {
        return meetingIdField;
    }

    public JPanel getIdePanel() {
        return idePanel;
    }

    public JPanel getEditorPanel() {
        return editorPanel;
    }

    public JPanel getChatPanel() {
        return chatPanel;
    }

    public JPanel getMeetingControlBar() {
        return meetingControlBar;
    }

    public JButton getStartChatButton() {
        return startChatButton;
    }

    public JButton getStartIdeButton() {
        return startIdeButton;
    }

    public JButton getLeaveMeetingButton() {
        return leaveMeetingButton;
    }

    public JPanel getOutputPanel() {
        return outputPanel;
    }

    public JPanel getEditorControlBar() {
        return editorControlBar;
    }

    public JButton getNewFileButton() {
        return newFileButton;
    }

    public JButton getOpenFileButton() {
        return openFileButton;
    }
    // ******************* setter methods **************************

}

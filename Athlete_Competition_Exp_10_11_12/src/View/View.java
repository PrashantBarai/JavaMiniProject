package View;

import Controller.Controller;
import Model.manageAthlete;


import javax.swing.*;
import java.util.ArrayList;

/**
 * Identification comments:
 *   Name: Prashant Barai and Ammar Ansari
 *   Experiment No: 10,11,12
 *   Experiment Title: Implementing view class in java using swing and AWT for your chosen case study using MVC Architecture.
 *   Experiment Date: 27/09/2023
 *   @version 1.0
 *
 * Beginning comments:
 *   Filename: View.java
 *   Author: @Prashant_Barai and @Ammar_Ansari
 *   Overview: The View class in a Java program with Swing and AWT GUI components serves as the user interface.
 *   It initializes the main frame and provides methods for updating and displaying athlete-related data.
 */

public class View {
    private MainFrame mf;
    private Controller controller;

    public View() {
        mf = new MainFrame();
        initUpdateButton(); // Call the method to set up the update button
    }

    /**
     * @return the mf
     */
    public MainFrame getMf() {
        return mf;
    }

    /**
     * @param mf the mf to set
     */
    public void setMf(MainFrame mf) {
        this.mf = mf;
    }

    public void centerInitialSetup(int linesBeingDisplayed, int size) {
        mf.getIp().getCp().createDisplay(linesBeingDisplayed, size);
    }

    public void centerUpdate(ArrayList<ArrayList<String>> lines, ArrayList<String> headers) {
        mf.getIp().getCp().updateDisplayAthlete(lines,headers);
    }

    public void centerUpdateCompetition(ArrayList<ArrayList<String>> lines, ArrayList<String> headers) {
        mf.getIp().getCp().updateDisplayCompetition(lines,headers);
    }

    private void initUpdateButton() {
        // Create the "Update" button
        JButton updateButton = new JButton("Update");

        // Add an action listener to handle button clicks
        updateButton.addActionListener(e -> {
            // Display a dialog to input athlete ID for update
            String athleteIdToUpdate = JOptionPane.showInputDialog(mf, "Enter Athlete ID to Update:");
            if (athleteIdToUpdate != null && !athleteIdToUpdate.isEmpty()) {
                // Here, you can gather and validate the update data
                // For simplicity, we'll assume you have gathered update data in this code block.

                // Call the Controller to update the athlete
                int athleteId = Integer.parseInt(athleteIdToUpdate);
                String newName = "New Name"; // Replace with actual updated data
                int newAge = 25; // Replace with actual updated data

                controller.updateAthlete(athleteId, newName, newAge);

                // After updating the athlete, save the changes to the JSON file
                manageAthlete.writeJsonFile();
            } else {
                JOptionPane.showMessageDialog(mf, "Invalid Athlete ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Add the "Update" button to your UI (button panel in this case)
        mf.getIp().getBp().add(updateButton);
    }

    // Add this method to set up the update button
    private void initUpdateButton() {
        // In your UI code (View.java)
        JTextField athlete_nameField = new JTextField();
        JTextField heightField = new JTextField();
        JTextField weightField = new JTextField();
        JTextField genderField = new JTextField();
        JTextField nationalityField = new JTextField();
        JTextField emailField = new JTextField();
        JTextField mobile_noField = new JTextField();

        JButton updateButton = new JButton("Update");
        updateButton.addActionListener(e -> {
            int athleteIdToUpdate = 1; // Replace with the athlete's ID to update
            String newathlete_name = athlete_nameField.getText();
            double newheight = Double.parseDouble(heightField.getText());
            double newweight = Double.parseDouble(weightField.getText());
            String newgender = genderField.getText();
            String newnationality = nationalityField.getText();
            String newemail = emailField.getText();
            long newmobile_no = Long.parseLong(mobile_noField.getText());

            // Call the Controller to update the athlete
            controller.updateAthlete(athleteIdToUpdate, newathlete_name, newheight, newweight, newgender, newnationality, newemail, newmobile_no);

            // After updating the athlete, save the changes to the JSON file
            manageAthlete.writeJsonFile();
        });

        // Add the updateButton to your UI (you should have a panel or frame to add it to)
        // For example, if you have a JPanel to hold buttons, you can add it like this:
        // mf.getIp().getYourPanel().add(updateButton);
    }
}

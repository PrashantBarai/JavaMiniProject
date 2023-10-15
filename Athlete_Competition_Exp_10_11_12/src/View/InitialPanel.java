package View;

import javax.swing.*;

/**
 * Identification comments:
 *   Name: Prashant Barai and Ammar Ansari
 *   Experiment No: 10,11,12
 *   Experiment Title: Implementing view class in java using swing and AWT for your chosen case study using MVC Architecture.
 *   Experiment Date: 27/09/2023
 *   @version 1.0
 *
 * Beginning comments:
 *   Filename: InitialPanel.java
 *   Author: @Prashant_Barai and @Ammar_Ansari
 *   Overview: The InitialPanel class is a Swing-based Java class responsible for creating and managing the initial panel within the main application window.
 *   It contains a CenterPanel for displaying athlete data and a ButtonPanel for user interaction.
 *   This panel is an essential part of the user interface in the MVC architecture, facilitating the display of athlete information and interaction with the application's functionality.
 */

public class InitialPanel extends JPanel{
    private CenterPanel cp;
    private ButtonPanel btn_p;

    public InitialPanel() {
        super();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        btn_p = new ButtonPanel();
        this.add(btn_p);
        validate();
        repaint();
        cp = new CenterPanel();
        this.add(cp);
        validate();
        repaint();
    }

    public CenterPanel getCp() {
        return cp;
    }

    /**
     * @param cp the cp to set
     */
    public void setCp(CenterPanel cp) {
        this.cp = cp;
    }

    public ButtonPanel getBp() {
        return btn_p;
    }

    /**
     * @param btn_p the cp to set
     */
    public void setBp(ButtonPanel btn_p) {
        this.btn_p = btn_p;
    }
}

package View;

import javax.swing.*;
import java.awt.*;

/**
 * Identification comments:
 *   Name: Prashant Barai and Ammar Ansari
 *   Experiment No: 10,11,12
 *   Experiment Title: Implementing view class in java using swing and AWT for your chosen case study using MVC Architecture.
 *   Experiment Date: 27/09/2023
 *   @version 1.0
 *
 * Beginning comments:
 *   Filename: ButtonPanel.java
 *   Author: @Prashant_Barai and @Ammar_Ansari
 *   Overview: The ButtonPanel class is a Swing-based Java class that represents a panel containing three buttons within the user interface.
 *   These buttons, namely "Athlete," "Competition," and "Participation," are designed to serve as navigation elements, allowing users to switch between different views or functionalities within the application.
 *   This class is an essential component of the graphical user interface (GUI) and contributes to the user's interaction with the application, following the principles of MVC architecture.
 */

public class ButtonPanel extends JPanel {
    JButton btn_athlete = new JButton();
    JButton btn_competition = new JButton();
    JButton btn_participation = new JButton();
    JButton  updateButton = new JButton();
//this.add(updateButton);

    public ButtonPanel(){
        btn_athlete.setBackground(Color.cyan);
        btn_athlete.setPreferredSize(new Dimension(130,35));
        btn_athlete.setText("Athlete");
        this.add(btn_athlete);
        validate();
        repaint();
        btn_competition.setBackground(Color.cyan);
        btn_competition.setPreferredSize(new Dimension(130,35));
        btn_competition.setText("Competition");
        this.add(btn_competition);
        validate();
        repaint();
        btn_participation.setBackground(Color.cyan);
        btn_participation.setPreferredSize(new Dimension(130,35));
        btn_participation.setText("Participation");
        this.add(btn_participation);
        validate();
        repaint();
         updateButton.setBackground(Color.cyan);
         updateButton.setPreferredSize(new Dimension(130,35));
         updateButton.setText("Update");
        this.add( updateButton);
        validate();
        repaint();
    }

    public JButton getBtn_athlete() {
        return btn_athlete;
    }

    public JButton getBtn_competition() {
        return btn_competition;
    }

    public JButton getBtn_participation() {
        return btn_participation;
    }

    public JButton getUpdateButton() {
        return updateButton;
    }
}

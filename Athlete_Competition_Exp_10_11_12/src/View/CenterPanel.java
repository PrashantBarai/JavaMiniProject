package View;

import javax.swing.*;
import java.awt.*;
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
 *   Filename: CenterPanel.java
 *   Author: @Prashant_Barai and @Ammar_Ansari
 *   Overview: The CenterPanel class is a Swing-based Java class responsible for creating and managing the central panel of the application's user interface.
 *   It's designed to display data in a grid-like format. This class includes methods to create and update the display for both athlete and competition data.
 *   It uses lists of buttons to represent headers and individual data points, allowing users to interact with the displayed information.
 *   The class is an integral part of the MVC architecture, facilitating the visual representation of data and user interaction within the application.
 */

public class CenterPanel extends JPanel {
    ArrayList<JButton> header_buttons = new ArrayList<>();
    ArrayList<JButton> athlete_buttons = new ArrayList<>();
    ArrayList<JButton> competition_buttons = new ArrayList<>();

    public CenterPanel()
    {
        super();
    }

    public void createDisplay(int rows, int cols)
    {
        ArrayList<JButton> buttons = new ArrayList<>();
        ArrayList<JButton> ab = new ArrayList<>();

        this.removeAll();
        this.revalidate();
        this.repaint();
        this.setLayout(new GridLayout(rows+1,cols));
        for (int i = 1; i <= cols; i++)
        {
            JButton b = new JButton();
            b.setBackground(Color.cyan);
            b.setPreferredSize(new Dimension(80,25));
            buttons.add(b);
            this.add(b);
            validate();
            repaint();
        }
        header_buttons=buttons;

        for (int i = 1; i <= rows * cols; i++)
        {

            JButton b = new JButton();
            b.setBackground(Color.cyan);
            b.setPreferredSize(new Dimension(120,25));
            ab.add(b);
            this.add(b);
            validate();
            repaint();
        }
        athlete_buttons=ab;


    }

    public void updateDisplayAthlete(ArrayList<ArrayList<String>> lines, ArrayList<String> headers) {

        for (int i = 0; i < headers.size(); i++)
        {
            setHeaderButtonText(i,headers.get(i));
        }

        for (int athlete_no = 0; athlete_no < lines.size(); athlete_no++)
        {
            for (int athlete_col_no = 0; athlete_col_no < headers.size(); athlete_col_no++)
            {
                int button_no = athlete_no * headers.size() + athlete_col_no;
                String button_txt = lines.get(athlete_no).get(athlete_col_no);
                setAthleteButtonText(button_no,button_txt);
            }
        }
    }

    public void updateDisplayCompetition(ArrayList<ArrayList<String>> lines, ArrayList<String> headers) {
        for (int i = 0; i < headers.size(); i++)
        {
            setHeaderButtonText(i,headers.get(i));
        }

        for (int competition_no = 0; competition_no < lines.size(); competition_no++)
        {
            for (int competition_col_no = 0; competition_col_no < headers.size(); competition_col_no++)
            {
                int button_no = competition_no * headers.size() + competition_col_no;
                String button_txt = lines.get(competition_no).get(competition_col_no);
                setCompetitionButtonText(button_no,button_txt);
            }
        }
    }

    public void setHeaderButtonText(int button_no, String button_text) {
        header_buttons.get(button_no).setText(button_text);
    }
    public void setAthleteButtonText(int button_no, String button_text) {
        athlete_buttons.get(button_no).setText(button_text);
    }
    public void setCompetitionButtonText(int button_no, String button_text) {
        competition_buttons.get(button_no).setText(button_text);
    }

    public ArrayList<JButton> getHeaderButtons()
    {
        return header_buttons;
    }

    public ArrayList<JButton> getAthlete_buttons()
    {
        return athlete_buttons;
    }

    public ArrayList<JButton> getCompetition_buttons()
    {
        return competition_buttons;
    }
}

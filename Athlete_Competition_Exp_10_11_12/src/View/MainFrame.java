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
 *   Filename: MainFrame.java
 *   Author: @Prashant_Barai and @Ammar_Ansari
 *   Overview: The MainFrame class is a Swing-based Java class responsible forss creating and managing the main application window.
 *   It sets up an initial panel (InitialPanel) as the central content of the window.
 *   The window's title and size are configured, making it ready to display data related to athletes in this case.
 */

public class MainFrame extends JFrame {
    private InitialPanel ip;

    public MainFrame() {
        super("Athlete Table");
        ip = new InitialPanel();
        add(ip, "Center");
        //------------------------------------------------------
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setSize(1600, 800);
        setVisible(true);
    }

//    public MainFrameCompetition() {
//        super("Competition Table");
//        ip = new InitialPanel();
//        add(ip, "Center");
//        //------------------------------------------------------
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        pack();
//        setSize(1600,800);
//        setVisible(true);
//    }

    /**
     * @return the ip
     */
    public InitialPanel getIp() {
        return ip;
    }

    /**
     * @param ip the ip to set
     */
    public void setIp(InitialPanel ip) {
        this.ip = ip;
    }
}

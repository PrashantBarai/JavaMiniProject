import Controller.Controller;
import Model.*;
import View.View;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Identification comments:
 *   Name: Prashant Barai and Ammar Ansari
 *   Experiment No: 10,11,12
 *   Experiment Title: Implementing view class in java using swing and AWT for your chosen case study using MVC Architecture.
 *   Experiment Date: 27/09/2023
 *   @version 1.0
 *
 * Beginning comments:
 *   Filename: Main.java
 *   Author: @Prashant_Barai and @Ammar_Ansari
 *   Overview: The Main class is the entry point for a Java program implementing a Model-View-Controller (MVC) architecture.
 *   It initializes the MVC components: View, Model, and Controller, laying the foundation for a graphical user interface (GUI) application.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
    }
}

package Model;

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
 *   Filename: Displayable.java
 *   Author: @Prashant_Barai and @Ammar_Ansari
 *   Overview: The Displayable interface defines a set of methods that provide access to tabular data for display purposes.
 *   It's designed to be implemented by classes that represent tables or similar structured data.
 *   The Displayable interface defines a standard way to access and manage tabular data for presentation, making it suitable for use in various GUI applications following the MVC architecture.
 */

public interface Displayable {
    /*
   The getLine(int line) method returns an ArrayList of String objects that represent a single row of the table.
   The method takes an integer argument line that specifies which row to retrieve. The method retrieves the FootballPlayer object
   at the specified index in the students list and then extracts the various attributes of the student such as their name, height, weight,
   etc. These attributes are then added to the ArrayList and returned.
    */
    ArrayList<String> getLine(int line);

    /*
    The getLines(int firstLine, int lastLine) method returns an ArrayList of ArrayList of String objects that represent a subset of rows
    of the table. The method takes two integer arguments firstLine and lastLine that specify the range of rows to retrieve.
    The method then iterates over this range and calls getLine(int line) for each row, adding the resulting ArrayList of attributes to a
    new ArrayList of ArrayList of String objects that is then returned.
     */
    ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine);

    public int getFirstLineToDisplay();
    public int getLineToHighlight();
    public int getLastLineToDisplay();
    public int getLinesBeingDisplayed();

    public void setFirstLineToDisplay(int firstLine);
    public void setLineToHighlight(int highlightedLine);
    public void setLastLineToDisplay(int lastLine);
    public void setLinesBeingDisplayed(int numberOfLines);
}
package Model;

import java.util.ArrayList;

/**
 * Identification comments:
 *    Name: Prashant Barai and Ammar Ansari
 *    Experiment No: 10,11,12
 *    Experiment Title: Implementing view class in java using swing and AWT for your chosen case study using MVC Architecture.
 *    Experiment Date: 27/09/2023
 *    @version 1.0
 *
 * Beginning comments:
 *   Filename: fileHandlingCompetition.java
 *   Author: @Prashant_Barai and @Ammar_Ansari
 *   Overview: The fileHandlingCompetition abstract class defines a common structure for handling Competition data in various file formats
 *   within a Java application. It declares abstract methods for reading Competition data from a file and writing Competition data to a file.
 *   Concrete classes will extend this abstract class and provide implementations for these methods to handle specific file formats like JSON,
 *   CSV, or XML. This abstraction allows for flexibility and extensibility in handling different types of data storage.
 */
abstract class fileHandlingCompetition {
    abstract public ArrayList<Competition> readJsonFile(String file_path);
    abstract public void writeJsonFile(ArrayList<Competition> competition);
    //public void readCSVFile(String file_path);
    //public void readXMLFile(String file_path);

}

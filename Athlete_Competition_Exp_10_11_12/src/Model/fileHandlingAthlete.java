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
 *   Filename: fileHandlingAthlete.java
 *   Author: @Prashant_Barai and @Ammar_Ansari
 *   Overview: The fileHandlingAthlete abstract class defines a common structure for handling Athlete data in various file formats within
 *   a Java application. It declares abstract methods for reading Athlete data from a file and writing Athlete data to a file.
 *   Concrete classes will extend this abstract class and provide implementations for these methods to handle specific file formats like JSON,
 *   CSV, or XML. This abstraction allows for flexibility and extensibility in handling different types of data storage.
 *
 * Attribute Comments:
 *    athlete_parent_email: A String attribute that represents the email of the parent or guardian of an athlete.
 *    This attribute can be used to associate an athlete with their parent or guardian's email.
 */

abstract class fileHandlingAthlete {

    String athlete_parent_email;
    abstract public ArrayList<Athlete> readJsonFile(String file_path);
    abstract public void writeJsonFile(ArrayList<Athlete> athlete);
    //public void readCSVFile(String file_path);
    //public void readXMLFile(String file_path);

}

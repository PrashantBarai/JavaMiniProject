package Model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Identification comments:
 *    Name: Prashant Barai and Ammar Ansari
 *    Experiment No: 10,11,12
 *    Experiment Title: Implementing view class in java using swing and AWT for your chosen case study using MVC Architecture.
 *    Experiment Date: 27/09/2023
 *    @version 1.0
 *
 * Beginning comments:
 *   Filename: manageAthlete.java
 *   Author: @Prashant_Barai and @Ammar_Ansari
 *   Overview: The manageAthlete class is responsible for managing athlete data. It reads athlete information from a JSON file,
 *   stores it in an ArrayList of Athlete objects, and provides methods to load and manipulate this data.
 *   It's a part of the MVC (Model-View-Controller) framework for handling athlete data in a Java application.
 *
 * Attribute Comments:
 *   athlete: ArrayList to store Athlete objects.
 */

public class manageAthlete extends fileHandlingAthlete implements Displayable {
    static ArrayList<Athlete> athletes = new ArrayList<>();

    private int linesBeingDisplayed;
    private int firstLineIndex;
    int lastLineIndex;
    int highlightedLine;

    public ArrayList<Athlete> getAthletes() {
        return athletes;
    }

    //public manageAthlete() { readJsonFile("C:/Academics/OOPM/My Project/Athlete_Competition_Exp_10_11_12/src/Model/AthleteJSON.json"); }
    @Override
    public ArrayList<Athlete> readJsonFile(String file_path) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read JSON file
            //JsonNode rootNode = objectMapper.readTree(new File("src/Model/temp.json"));
            JsonNode rootNode = objectMapper.readTree(new File("C:/Academics/OOPM/My Project/Athlete_Competition_Exp_10_11_12/src/Model/AthleteJSON.json"));

            // Iterate through JSON array
            if (rootNode.isArray()) {
                for (JsonNode node : rootNode) {
                    JsonNode idNode = node.get("id");
                    if (idNode != null && idNode.isInt()) {
                        int id = node.get("id").asInt();
                        String name = node.get("athlete_name").asText();
                        long mobile_no = node.get("mobile_no").asLong();
                        String email = node.get("email").asText();
                        String gender = node.get("gender").asText();
                        JsonNode nationalityNode = node.get("nationality");
                        String nationality = nationalityNode != null ? nationalityNode.asText().toUpperCase() : "";
                        double height = node.get("height").asDouble();
                        double weight = node.get("weight").asDouble();
                        Athlete ath = new Athlete(id, name, height, weight, gender, nationality, email, mobile_no);
                        athletes.add(ath);
                    } else {
                        System.out.println("Error: JSON data is missing or has incorrect types for an Athlete.");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return athletes;
    }



    @Override
    public void writeJsonFile(ArrayList<Athlete> athlete) {
        ObjectMapper Obj = new ObjectMapper();
        try {

            for (int i = 0; i < athlete.size(); i++)
            {
                // Converting the Java object into a JSON string
                String ath_str = Obj.writeValueAsString(athlete.get(i));
                // Displaying Java object into a JSON string
                System.out.println(ath_str);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> getHeaders() {
        ArrayList<String> headers = new ArrayList<String>();
        headers.add("Id");
        headers.add("Name");
        headers.add("Height");
        headers.add("Weight");
        headers.add("Gender");
        headers.add("Nationality");
        headers.add("Email");
        headers.add("MobileNo");
        return headers;
    }

    @Override
    public ArrayList<String> getLine(int line) {
        ArrayList<String> athlete_details = new ArrayList<String>();
        athletes = readJsonFile("C:/Academics/OOPM/My Project/Athlete_Competition_Exp_10_11_12/src/Model/AthleteJSON.json");
        athlete_details.add(String.valueOf(athletes.get(line).getId()));
        athlete_details.add(athletes.get(line).getAthlete_name());
        athlete_details.add(String.valueOf(athletes.get(line).getHeight()));
        athlete_details.add(String.valueOf(athletes.get(line).getWeight()));
        athlete_details.add(athletes.get(line).getGender());
        athlete_details.add(athletes.get(line).getNationality());
        athlete_details.add(athletes.get(line).getEmail());
        athlete_details.add(String.valueOf(athletes.get(line).getMobileNo()));

        return athlete_details;
    }

    public static void writeJsonFile() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Serialize the updated data back to the JSON file
            objectMapper.writeValue(new File("C:/Academics/OOPM/My Project/Athlete_Competition_Exp_10_11_12/src/Model/AthleteJSON.json"), athletes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> athletesSubset = new ArrayList<ArrayList<String>>();

        for (int i = firstLine; i <= lastLine; i++) {
            athletesSubset.add(getLine(i));
        }
        return athletesSubset;
    }

    @Override
    public int getFirstLineToDisplay() {
        return firstLineIndex;
    }

    @Override
    public int getLineToHighlight() {
        return highlightedLine;
    }

    @Override
    public int getLastLineToDisplay() {
        setLastLineToDisplay(getFirstLineToDisplay() + getLinesBeingDisplayed() - 1);
        return lastLineIndex;
    }

    @Override
    public int getLinesBeingDisplayed() {
        return linesBeingDisplayed;
    }

    @Override
    public void setFirstLineToDisplay(int firstLine) {
        firstLineIndex = firstLine;
    }

    @Override
    public void setLineToHighlight(int highlightedLine) {
        highlightedLine = highlightedLine;
    }

    @Override
    public void setLastLineToDisplay(int lastLine) {
        lastLineIndex = lastLine;
    }

    @Override
    public void setLinesBeingDisplayed(int numberOfLines) {
        linesBeingDisplayed = numberOfLines;
    }

    public ArrayList getTable() {
        return athletes;
    }
}


package Model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
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
 *   Filename: manageCompetition.java
 *   Author: @Prashant_Barai and @Ammar_Ansari
 *   Overview: The manageCompetition class is responsible for managing competition data. It reads competition information from a JSON file,
 *   stores it in an ArrayList of Competition objects, and provides methods to load and manipulate this data.
 *   It's a part of the MVC (Model-View-Controller) framework for handling competition data in a Java application.
 *
 * Attribute Comments:
 *   competition: ArrayList to store Competition objects.
 */
public class manageCompetition extends fileHandlingCompetition implements Displayable {
    ArrayList<Competition> competitions = new ArrayList<Competition>();

    private int linesBeingDisplayed;
    private int firstLineIndex;
    int lastLineIndex;
    int highlightedLine;
    public ArrayList<Competition> loadJsonFile(String file_path) {
        return readJsonFile(file_path);
    }
    public ArrayList<Competition> readJsonFile(String file_path) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read JSON file
            //JsonNode rootNode = objectMapper.readTree(new File("src/Model/temp.json"));
            JsonNode rootNode = objectMapper.readTree(new File(file_path));

            // Iterate through JSON array
            if (rootNode.isArray()) {
                for (JsonNode node : rootNode) {
                    JsonNode idNode = node.get("comp_id");
                    if (idNode != null && idNode.isInt()) {
                    int id = node.get("comp_id").asInt();
                    String comp_name = node.get("comp_name").asText().toUpperCase();
                    String comp_region = node.get("comp_region").asText();
                    String comp_prize = node.get("comp_prize").asText();
                    int comp_duration_months = node.get("comp_duration_months").asInt();
                    Competition temp_comp = new Competition();
                    temp_comp.setcomp_id(id);
                    temp_comp.setcomp_name(comp_name);
                    temp_comp.setcomp_region(comp_region);
                    temp_comp.setcomp_prize(comp_prize);
                    temp_comp.setcomp_duration_months(comp_duration_months);
                    competitions.add(temp_comp);
                    } else {
                        System.out.println("Error: JSON data is missing or has incorrect types for Competition.");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return competitions;
    }

    @Override
    public void writeJsonFile(ArrayList<Competition> competition) {
        ObjectMapper Obj = new ObjectMapper();
        try {

            for (int i = 0; i < competition.size(); i++)
            {
                // Converting the Java object into a JSON string
                String comp_str = Obj.writeValueAsString(competition.get(i));
                // Displaying Java object into a JSON string
                System.out.println(comp_str);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> getHeaders() {
        ArrayList<String> headers = new ArrayList<String>();
        headers.add("Id");
        headers.add("Comp_Name");
        headers.add("Comp_Region");
        headers.add("Comp_Prize");
        headers.add("Comp_Duration_Months");
        return headers;
    }

    @Override
    public ArrayList<String> getLine(int line) {
        ArrayList<String> competition_details = new ArrayList<String>();
        competitions = readJsonFile("C:/Academics/OOPM/My Project/Athlete_Competition_Exp_10_11_12/src/Model/CompetitionJSON.json");
        competition_details.add(String.valueOf(competitions.get(line).getcomp_id()));
        competition_details.add(competitions.get(line).getcomp_name());
        competition_details.add(String.valueOf(competitions.get(line).getcomp_region()));
        competition_details.add(String.valueOf(competitions.get(line).getcomp_prize()));
        competition_details.add(String.valueOf(competitions.get(line).getcomp_duration_months()));

        return competition_details;
    }

    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> competitionsSubset = new ArrayList<ArrayList<String>>();

        for (int i = firstLine; i <= lastLine; i++) {
            competitionsSubset.add(getLine(i));
        }
        return competitionsSubset;
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
        return competitions;
    }
}
package Model;

/**
 * Identification comments:
 *   Name: Prashant Barai and Ammar Ansari
 *   Experiment No: 10,11,12
 *   Experiment Title: Implementing view class in java using swing and AWT for your chosen case study using MVC Architecture.
 *   Experiment Date: 27/09/2023
 *   @version 1.0
 *
 * Beginning comments:
 *   Filename: Model.java
 *   Author: @Prashant_Barai and @Ammar_Ansari
 *   Overview:
 */

public class Model {
    protected manageAthlete manageAthleteData = new manageAthlete();
    protected manageCompetition manageCompetitionData = new manageCompetition();

    public Model() {
        manageAthleteData.setLinesBeingDisplayed(25);
        manageAthleteData.setFirstLineToDisplay(0);

        manageCompetitionData.setLinesBeingDisplayed(25);
        manageCompetitionData.setFirstLineToDisplay(0);
    }

    public manageAthlete getManageAthleteData() { return manageAthleteData; }
    public manageCompetition getManageCompetitionData() { return manageCompetitionData; }
}

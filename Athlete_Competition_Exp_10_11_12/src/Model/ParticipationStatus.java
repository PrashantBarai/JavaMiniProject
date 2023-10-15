package Model;
import java.util.Calendar;

/**
 * Identification comments:
 *    Name: Prashant Barai and Ammar Ansari
 *    Experiment No: 10,11,12
 *    Experiment Title: Implementing view class in java using swing and AWT for your chosen case study using MVC Architecture.
 *    Experiment Date: 27/09/2023
 *    @version 1.0
 *
 * Beginning comments:
 *   Filename: ParticipationStatus.java
 *   Author: @Prashant_Barai and @Ammar_Ansari
 *   Overview: The `ParticipationStatus` class represents the participation of an athlete in a specific competition.
 *   This is a simple interface to the participation class which has 3 methods for participation class
 *   It houses the method prototypes for the Participation class.
 *
 * Interface Comments:
 *   ParticipationStatus: This interface outlines the methods required for managing an athlete's participation
 *   in a specific competition. Concrete classes implementing this interface must provide implementations for
 *   the methods related to athlete participation, competition details, and displaying athlete information.
 */

public interface ParticipationStatus {
    void participation_athlete_competition(Athlete tempAth, Competition tempCompetition, Calendar temp_participation_date);
    void participation_athlete_competition();
    void displayAthleteInfo();
}

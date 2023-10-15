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
 *   Filename: Participation.java
 *   Author: @Prashant_Barai and @Ammar_Ansari
 *   Overview: The `Participation` class represents the participation of an athlete in a specific competition. It is used to associate an athlete and a competition with a participation date, forming a link between them.
 *   It serves as a bridge between an individual athlete, a chosen competition, and the date on which the participation occurred. This class encapsulates the necessary information to record and display athlete participation details.
 *   Various string functions are used in all classes, it is commented where the function(s) is being used.
 *   The partcipition class inherits the "ParticipationStatus" interface
 *   It implements 3 methods "participation_athlete_competition" and "displayAthleteInfo" and a setter called "void participation_athlete_competition(Athlete tempAth, Competition tempCompetition, Calendar temp_participation_date)"
 *   "displayAthleteInfo" is implemented as a separate case 7 in main. it simply displays all the important attributes of athletes.
 *   "participation_athlete_competition" is used to display the names of athletes and the competition in which they have taken part
 *   The 3 methods implemented are override which mean that they have been defined in this class.
 *
 * Attribute Comments:
 *   participation_date: Date when the athlete participated in the competition.
 *   ObjAth: Reference to the Athlete object participating in the competition.
 *   ObjCompetition: Reference to the Competition object of the participated competition.
 */
public class Participation implements ParticipationStatus{
    private Calendar participation_date;//creating a calendar object to store date
    Athlete ObjAth;

    Competition ObjCompetition;

    //METHOD OVERLOADING 2 METHODS DEFINED WITH SAME NAME BUT DIFFERENT SIGNATURES.

    @Override

    public void participation_athlete_competition(Athlete tempAth, Competition tempCompetition, Calendar temp_participation_date) {
        ObjAth = tempAth;
        ObjCompetition = tempCompetition;
        participation_date = temp_participation_date;
    }

    //displaying athlete name,competition name,participation time
    @Override
    public void participation_athlete_competition() {
        System.out.println("Athlete : ".concat(this.ObjAth.getAthlete_name() + " enrolled for Competition : " + this.ObjCompetition.getcomp_name() + " on " + this.participation_date.getTime()));
    }           //USING THE STRING METHOD CONCAT()

    @Override
    public void displayAthleteInfo() {
        System.out.println("Athlete Information:");
        System.out.println("Name: " + ObjAth.getAthlete_name());
        System.out.println("Email: " + ObjAth.getEmail());
        System.out.println("Gender: " + ObjAth.getGender());
    }


}
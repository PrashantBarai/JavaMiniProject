package Model;

/**
 * Identification comments:
 *    Name: Prashant Barai and Ammar Ansari
 *    Experiment No: 10,11,12
 *    Experiment Title: Implementing view class in java using swing and AWT for your chosen case study using MVC Architecture.
 *    Experiment Date: 27/09/2023
 *    @version 1.0
 *
 * Beginning comments:
 *   Filename: ParentCompetition.java
 *   Author: @Prashant_Barai and @Ammar_Ansari
 *   Overview: The `ParentCompetition` class represents the participation of an athlete in a specific competition.
 *   This is the parent class of the Competition class.
 *   It contains the required setters and attributes for inheritance.
 *   Both Athlete and Competition classes are prime examples of single inheritance.
 *   They are declared as public because Competition class should be able to access it.
 *   They are declared static to pass their ownership to the class instead of an object.
 *
 * Attribute Comments:
 *    id: The unique identification number of the competition.
 *    comp_region: The geographical region where the competition takes place.
 *    comp_prize: The prize associated with the competition.
 *    comp_duration_months: The duration of the competition in months.
 */

public class ParentCompetition extends manageCompetition {
    public int comp_id;
    public String comp_name;
    public String comp_region;
    public  String comp_prize;
    public int comp_duration_months;
    public void setcomp_id(int compId) { this.comp_id = compId; }
    public void setcomp_name(String comp_name)
    {
        this.comp_name = comp_name;
    }

    public void setcomp_region(String comp_region)
    {
        this.comp_region = comp_region;
    }

    public void setcomp_prize(String comp_prize)
    {
        this.comp_prize = comp_prize;
    }
    public void setcomp_duration_months(int comp_duration_months) {this.comp_duration_months = comp_duration_months;}
    public int getcomp_id()
    {
        return this.comp_id;
    }
    public String getcomp_name()
    {
        return this.comp_name;
    }
    public String getcomp_region()
    {
        return this.comp_region;
    }
    public String getcomp_prize()
    {
        return this.comp_prize;
    }
    public int getcomp_duration_months()
    {
        return this.comp_duration_months;
    }


    final public String displayComp()
    {
        return ("Id: "+getcomp_id()+ " \t\tName: "+getcomp_name()+ " \t\tRegion: "+getcomp_region()+ "  \t\tPrize: "+getcomp_prize()+ " \t\tDuration_Months: "+getcomp_duration_months());
    }
}

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
 *   Filename: Competition.java
 *   Author: @Prashant_Barai and @Ammar_Ansari
 *   Overview: This class represents a Competition and stores its attributes.  The `Competition` class represents a competition in which athletes can participate. It is designed to store various attributes related
 *   to the competition. The class is used to create objects that encapsulate information about individual competitions.
 *   The Competition class is a public class. Various string functions are used in all classes, it is commented where the function(s) is being used.
 *   This class is a subclass of ParentCompetition.ParentCompetition has method definitions and attributes of the competition class.
 *   It also has a parametrized constructor that takes in 4 parameters and calls the appropriate setters from the parent class
 *   It contains a empty constructor to handle unexpected exceptions.
 *
 * Attribute Comments:
 *   id: Unique identifier for the competition.
 *   comp_name: Name of the competition.
 *   comp_region: Geographical region or location of the competition.
 *   comp_prize: Prize associated with the competition.
 *   comp_duration_months: Duration of the competition in months.
 */


public class Competition extends ParentCompetition{
    /* Competition attributes */
    private String comp_name;
    //SETTERS
//    public Competition(){}
    public Competition(int comp_id, String comp_name,String comp_region,String comp_prize, int comp_duration_months){
        setcomp_id(comp_id);
        setcomp_name(comp_name);
        setcomp_region(comp_region);
        setcomp_prize(comp_prize);
        setcomp_duration_months(comp_duration_months);
    }

    public Competition() {
        super();
        int comp_id;
        String comp_name;
        String comp_region;
        String comp_prize;
        int comp_duration_months;
    }


    public void setcomp_id(int comp_id)
    {
        this.comp_id = comp_id;
    }
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
    public void setcomp_duration_months(int comp_duration_months)
    {
        this.comp_duration_months = comp_duration_months;
    }

    //GETTERS
    public int getcomp_id()
    {
        return this.comp_id;
    }

    public  String getcomp_name()
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

//    public void displayComp(){}
}

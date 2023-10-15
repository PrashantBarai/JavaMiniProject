package Model;

/**
 * Identification comments:
 *   Name: Prashant Barai and Ammar Ansari
 *   Experiment No: 10,11,12
 *   Experiment Title: Implementing view class in java using swing and AWT for your chosen case study using MVC Architecture.
 *   Experiment Date: 27/09/2023
 *   @version 1.0
 *
 *
 * Beginning comments:
 *   Filename: Athlete.java
 *   Author:  @Prashant_Barai and @Ammar_Ansari
 *   Overview: This class is created to store the attributes of an Athlete. It is a subclass of the class "Person" which inherits
 *   some of the attributes from the Person class. The "Person" class represents the "Person" object and implements the interface named
 *   "Table Member". Various string functions are used in all classes, it is commented where the function(s) is being used.
 *   The Athlete class is a subclass of the Person class it inherits some of the attributes of the
 *   Person class. This class also includes a constructor to set the values for us hence their is not much need
 *   for setters. the class representing the "Person" object implements the interface named "Table Member".
 *
 *
 * Attribute comments:
 * id : It's the Athlete's ID.
 * name : It's the Athlete's name.
 * dob : It's the Athlete's date of birth.
 * mobile_no : It's the Athlete's mobile number.
 * email : It's the Athlete's e-mail address.
 * gender : It's the Athlete's gender.
 * nationality : It's the Athlete's nationality.
 * height : It's the Athlete's height.
 * weight : It's the Athlete's weight.
 */
public class Athlete extends Person {

    /* Athlete attributes */
    /*private String athlete_name;
    private int id;
    private double height;
    private double weight;
    */
    private String nationality;
    //SETTERS
    public Athlete(int id,String athlete_name,double height,double weight,String gender,String nationality,String email,long mobile_no){
        super(id, athlete_name, mobile_no, email, gender, nationality, height, weight);//Parametrized constructor for assigning values to attributes
        this.nationality=nationality;
    }

    public Athlete() { super();}

    public void copy(Athlete a){
        this.id = a.getId();
        this.athlete_name= a.getAthlete_name();
        this.height= a.getHeight();
        this.weight= a.getWeight();
        this.nationality= a.getNationality();
        this.email= a.getEmail();
        this.gender= a.getGender();
        this.mobile_no= a.getMobileNo();
    }

    // Setters methods for the Athlete attributes
    public void setAthleteId(int athleteId) {
        this.id = athleteId;
    }

    public void setAthlete_name(String athlete_name) {
        this.athlete_name = athlete_name;
    }

//    public void setDOB(Calendar dob) {
//        this.dob = dob;
//    }

    public void setMobileNo(long mobile_no) {
        this.mobile_no = mobile_no;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    //GETTERS methods for the Athlete attributes
    public int getId() {
        return this.id;
    }

    public String getAthlete_name() {
        return this.athlete_name;
    }

//    public Calendar getDOB() {
//        return this.dob;
//    }

    public long getMobileNo() {
        return this.mobile_no;
    }

    public String getEmail() {return this.email;}

    public String getGender() {
        return this.gender;
    }

    public String getNationality() {
        return this.nationality;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public String displayAth() {
        return ("id: "+getId()+ " \tName: "+getAthlete_name()+ " \tNationality: " + getNationality() + " \tMobile No: "+getMobileNo()+ "  \tEmail: "+getEmail()+ " \tGender: "+getGender()+ " \tHeight: "+getHeight()+ " \tWeight: "+getWeight());
    }
}

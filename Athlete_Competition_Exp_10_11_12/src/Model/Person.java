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
 *   Filename: Person.java
 *   Author: @Prashant_Barai and @Ammar_Ansari
 *   Overview: The `Person` class represents the attributes of an athlete required in a specific competition.
 *   This is a parent class to athlete class it has 4 attributes already defined for the athlete class.
 *   They are  declared as public because Athlete class should be able to access it.
 *   They are declared static to pass their ownership to the class instead of an object.
 *
 * Attribute Comments:
 *   id : It's the Athlete's ID.
 *   name : It's the Athlete's name.
 *   dob: Represents the date of birth of the person. It is a Calendar object indicating the person's birthdate.
 *   mobile_no: Represents the mobile number of the person. It is of type long and stores the person's contact number.
 *   email: Represents the email address of the person. It is a string that holds the person's email for communication.
 *   gender: Represents the gender of the person. It is a string indicating the person's gender (e.g., "Male", "Female", etc.).
 *   nationality : It's the Athlete's nationality.
 *   height : It's the Athlete's height.
 *   weight : It's the Athlete's weight.
 */

public class Person extends manageAthlete {

        public int id;
        public String athlete_name;
        public long mobile_no;
        public String email;
        public String gender;

//        public Calendar dob;
        public double height;
        public double weight;

        public Person(int Id, String athlete_name, long mobile_no, String email, String gender, String nationality, double height, double weight)
        {
            setId(Id);
            setAthlete_name(athlete_name);
            setMobileNo(mobile_no);
            setEmail(email);
            setGender(gender);
            setHeight(height);
            setWeight(weight);
        }

        public Person() {}

        public Person(String athlete_name, long mobile_no, String email, String gender, String nationality, double height, double weight)
        {
            int Id = (int) Math.random();
            System.out.println("Athlete Created with Id: "+ Id);
            setId(Id);
            setAthlete_name(athlete_name);
            setMobileNo(mobile_no);
            setEmail(email);
            setGender(gender);
            setHeight(height);
            setWeight(weight);
        }
    public void setId(int id) { this.id = id; }
        public void setAthlete_name(String athlete_name)
        {
            this.athlete_name = athlete_name;
        }


        public void setMobileNo(long mobile_no)
        {
            this.mobile_no = mobile_no;
        }
        public void setEmail(String email)
        {
            this.email = email;
        }
        public void setGender(String gender)
        {
            this.gender = gender;
        }

        public void setHeight(double height){this.height = height;}
        public void setWeight(double weight){this.weight = weight;}

        public int getId()
        {
            return this.id;
        }
        public String getAthlete_name()
        {
            return this.athlete_name;
        }

        public long getMobileNo()
        {
            return this.mobile_no;
        }
        public String getEmail() { return this.email; }

        public String getGender()
        {
            return this.gender;
        }
        public double getHeight(){return this.height;}
        public double getWeight(){return this.weight;}
}

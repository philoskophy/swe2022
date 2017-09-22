package lesson3;

public class Counstructor {

    private String firstName;
    private String lastName;

    public Counstructor(){
        this("john","doe");
    }

    public Counstructor(String fname){
        this(fname,"doe");
    }

    public Counstructor(String fname, String lname){
        firstName = fname;
        lastName = lname;
    }

    public String getName() {
        return firstName + " " + lastName;
    }
}

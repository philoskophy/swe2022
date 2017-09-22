package lesson3;

import java.util.ArrayList;

public class Constructor {

    final String firstName;
    private final String lastName;
    private String seperator;
    private ArrayList<String> friends;
    {
        seperator = " ";
    }
    {
        friends = new ArrayList<>();
        friends.add("mike");
        friends.add("jane");
    }

    public Constructor(){
        this("john", "doe");
    }
    public Constructor(String fname){
        this(fname, "doe");
    }
    public Constructor(String fname, String lname){
        firstName = fname;
        lastName = lname;
    }
    public String getName(){
        return firstName + seperator + lastName;
    }
    public String getName(String a){
        return a;                            //메소드의 시그니쳐는 이름과 인자다, 반환값과는 관계X
    }
    public String getFriend(int index){
        return friends.get(index);
    }
}
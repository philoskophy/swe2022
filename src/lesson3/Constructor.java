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

    static public int plus (int a, int b){
        return a + b ;
    }
    public String getName(){
        int a = this.plus(3,5);
        int b = plus(6,7);
        int c = Constructor.plus(5,1);    // 위의 abc 세개가 모두 작동하지만 c 가 정석
       return firstName + seperator + lastName;
    }
    public String getName(String a){
        return a;                            //메소드의 시그니쳐는 이름과 인자다, 반환값과는 관계X
    }
    public String getFriend(int index){
        return friends.get(index);
    }
}
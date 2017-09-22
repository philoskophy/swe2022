package lesson3;


public class ClassBase1 {
    static public void main(String[] arg){
        Counstructor c = new Counstructor();
        System.out.println(c.getName());

        Counstructor c1 = new Counstructor("shinkang");
        System.out.println(c1.getName());

        Counstructor c2 = new Counstructor("shin","kang");
        System.out.println(c2.getName());
    }



}

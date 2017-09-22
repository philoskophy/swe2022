package lesson3;

public class ClassBase1 {
    static public void main(String[] arg){
        Counstructor c = new Counstructor();
        System.out.println(c.getName());
        System.out.println(c.getFriend(0));
        Counstructor c1 = new Counstructor("shinkang");
        System.out.println(c1.getName());
        System.out.println(c1.getFriend(0));
        Counstructor c2 = new Counstructor("shinkang", "kang");
        System.out.println(c2.getName());
        System.out.println(c2.getFriend(0));
    }
}
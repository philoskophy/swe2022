package lesson3;

public class ClassBase1 {
    static public void main(String[] arg){
        Constructor c = new Constructor();
        System.out.println(c.getName());
        System.out.println(c.getFriend(0));
        Constructor c1 = new Constructor("shinkang");
        System.out.println(c1.getName());
        System.out.println(c1.getFriend(0));
        Constructor c2 = new Constructor("shinkang", "kang");
        System.out.println(c2.getName());
        System.out.println(c2.getFriend(0));

        NoConst no= new NoConst();
        System.out.println(no.getFirstName(c2));

        System.out.println(Constructor.plus(3, 6));
        // 기본은 클래스이름.정적메소드
        System.out.println(c2.plus(3,5));
        // 안좋은 예. 작동은 함

    }
}
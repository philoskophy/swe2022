package lesson8;

public class CloneMain {
//결과값으로 0이 출력됨 / 20이 출력이 되어야 성공한 것 . 왜 0 이 뜨는지 모르겠음.
    static public void main(String[] arg){
        Base b1 = new Base(10);
        Owner o1 = new Owner(10,b1);

        //Owner o2 = o1.clone();   //유일자원을 물고 있으면 클론을 하면 안된다.
        Owner o2 = null;
        try {
            o2 = o1.clone();
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        Base b2 = o1.getBase();
        b2.baseValue = 20;
        System.out.println(o2.getBase().baseValue);
    }

}

package c0915;

public class ControlState {
    static public void main(String[] arg){
       System.out.println("point1");
       test1:{
           int a = 3;
           if (a>1) break test1;
           System.out.println("point2");
       }
        System.out.println("point3");
        }
    }

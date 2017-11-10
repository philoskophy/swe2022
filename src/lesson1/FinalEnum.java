package lesson1;

public class FinalEnum {
    public static final int MONDAY = 0;
    public static final int TUESDAY = 1;
    public enum Weekday {MON, TUE, WED, THU, FRI, SAT, SUN};
    public static void  main(String[] args){
        final int DAYS_IN_FEBRUARY;
        boolean leapYear = true;
        if(leapYear){
            DAYS_IN_FEBRUARY = 29;
        }else{
            DAYS_IN_FEBRUARY = 28;
        }
        System.out.println(DAYS_IN_FEBRUARY);
        System.out.println(MONDAY);
        System.out.println(TUESDAY);
        Weekday startDay = Weekday.MON;
        System.out.println(startDay);
    }
}

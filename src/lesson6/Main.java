package lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    static class Run implements Runnable{

        @Override
        public void run() {
            for(int i = 0; i < 1000; i++) Main.doWork(); //doWork()
        }
/*
        private void doWork() {
        }
        */
    }
    static class Run2 implements Runnable{
        @Override
        public void run() {
            for(int i = 0; i < 2000; i++) Main.doWork();
        }
    }
    static class LengthComparator implements Comparator<String> {

        @Override
        public int compare(String first, String second) {
            return first.length() - second.length();
        }
    }
    static class EmployeeComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee first, Employee second) {
            return first.salary - second.salary;
        }
    }
    static void doWork(){}

    enum Weekday {MON, TUE, WED, THU, FRI, SAT, SUN};

    static public void main(String[] arg){


    }
}

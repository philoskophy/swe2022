package lesson5;

import java.util.Arrays;

public class Main {
    static public void main(String[] args){
        Customer customer = new Customer();
        Banker banker = new Banker();
        System.out.println(customer.deposit(banker, Currency.WON, 20));
        System.out.println(customer.deposit(banker, Currency.WON, 200));


        Employee me = new Employee(100), you = new Employee(200);
        System.out.println(me.compareTo(you));
        System.out.println((Competition.compare(you, me)));

        Employee[] employee = {me, you};
        Arrays.sort(employee);
        System.out.println(employee[0] == you);
    }


}

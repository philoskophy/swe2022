package lesson5;

public class Main {
    static public void main(String[] args){
        Customer customer = new Customer();
        Banker banker = new Banker();
        System.out.println(customer.deposit(banker, Currency.WON, 20));
        System.out.println(customer.deposit(banker, Currency.WON, 200));
    }
}

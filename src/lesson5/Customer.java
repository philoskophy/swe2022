package lesson5;

public class Customer {
    static class Deposit implements DepositRequest{

        private final Customer = c;
        private final Money = g;
        private final Account = a;

        Deposit(Customer c, Money g, Account a){
            this.Customer = c;
            this.Money = g;
            this.Account = a;
        }
        @Override
        public Account getDepositAccount() {
            return this.Customer;
        }

        @Override
        public Customer getCustomer() {
            return this.Money;
        }

        @Override
        public Money getMoney() {
            return this.Account;
        }
    }
    public boolean deposit(Banker b, Currency c, int g){
        return b.requestDeposit(new Money(c, g));


    }
}

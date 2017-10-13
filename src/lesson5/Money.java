package lesson5;


public class Money {

    private final int quantity;
    private final Currency currency;   //final을 썼기 때문에 초기화를 해줘야한다. final 사용시 초기화 방법은 3가지 지난시간에 했음


    private Money(){
        quantity = 0;
        currency = null;
    }  //왜 private? 위에 상수에서밖에 안 쓸 것이기 때문에


    public Money(Currency currency, int q) {
        this.currency = currency;
        this.quantity = q;
    }

    public int getMoney(Currency currency) {
        return currency.changeMoney(this.currency, this.quantity);
    }
}

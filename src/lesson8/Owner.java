package lesson8;
//가시성을 낮춰 - 간섭하는 애들이 줄어든다.

class Owner {
    private final int ownerValue;
    private final Base ownerBase;

     Owner(int ownerValue, Base ownerBase) {
       this.ownerValue = ownerValue;
        this.ownerBase = ownerBase;
    }


    @Override
    protected Owner clone() throws CloneNotSupportedException {
         //얕은복사
        Owner result = new Owner(this.ownerValue,this.ownerBase);
        //깊은복사
        result = new Owner(this.ownerValue,this.ownerBase.clone());
        return result;
    }

    public Base getBase() {
         return ownerBase;
    }
}

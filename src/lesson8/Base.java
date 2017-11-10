package lesson8;

class Base {
    int baseValue;

    public Base(int baseCalue) {
        this.baseValue = baseValue;

    }

    @Override
    protected Base clone () throws CloneNotSupportedException {
        return new Base(this.baseValue);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;           //부하가 적고 가장 먼저 배제해야하기 때문.
        if(!(obj instanceof Base)) return false;
        if(obj.hashCode() == this.hashCode()) return true;
        return this.baseValue == ((Base)obj).baseValue;
    }

    @Override
    public String toString() {
        return "base:" + this.hashCode() + ":value=" + this.baseValue;
    }
}

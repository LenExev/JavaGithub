package ExtendsClassesPackage.Money;

public  class Money {
    private int dollars=0;
    private int cents=0;

    public Money(int dollars, int cents) {
        setDollars(dollars);
        setCents(cents);
    }

    public  void display() {
        System.out.printf("%d.%02d%n", dollars, cents);
    }

    public void setAmount(int dollars, int cents) {
        setDollars(dollars);
        setCents(cents);
    }

    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    public void setDollars(int dollars) {
        this.dollars = Math.max(dollars, 0);
    }

    public void setCents(int cents) {
        if(cents > 99) {
            int n1 = cents % 100;
            this.cents = n1;
            n1 = cents / 100;
            this.dollars += n1;
        } else this.cents = Math.max(cents, 0);
    }
}

public class Debt {                                 // debt: borc
                                                    // balance: bakiye
    private double balance;                         // interest: faiz
    private double interestRate;                    // initial: baslangic

    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
     // balance = initialBalance;
        interestRate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println(this.balance);
    }

    public void waitOneYear() {
        this.balance = this.balance * interestRate;
    }
}



package statements;

public class Investment {
    private double cost = 0.3;
    private int fund;
    private int interestRate;
    private boolean active = true;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days) {
        return getFund() * (interestRate/100.0) * (days/365.25);
    }
    public double close(int days){
        double withdraw = active ? ((getFund() + getYield(days)) * (1-(cost/100))) : 0.0;
        active = false;
        return withdraw;
    }
}

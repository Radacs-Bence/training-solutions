package initalizer;

import java.util.ArrayList;
import java.util.List;


public class CreditCard {

    private static final List<Rate> RATES = new ArrayList<>();
    private long balance;

    public CreditCard(long balance, Currency currency, List<Rate> rates) {
        RATES.addAll(rates);
        double conversionRate = conversionFinder(currency);
        this.balance = Math.round(balance * conversionRate);
    }

    public CreditCard(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public boolean payment(long amount, Currency currency){
        boolean success = false;
        long converted = Math.round(amount * conversionFinder(currency));
        if (converted <= balance){
            balance -= converted;
            success = true;
        }
        return success;
    }

    public boolean payment(long amount){
        return payment(amount, Currency.HUF);
    }


    private double conversionFinder(Currency currency){
        double result= 1.0;
        for (Rate rate: RATES) {
            if (rate.getCurrency() == currency){
                result = rate.getConversionFactor();
            }
        }
        return result;
    }
}

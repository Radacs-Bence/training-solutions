package staticattrmeth.bank;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankTransaction {

    private long trxValue;
    private static long currentMinValue;
    private static long currentMaxValue;
    private static BigDecimal sumOfTrxs;
    private static int counter;
    private static final long MAX = 10_000_000;
    private static final long MIN = 1;

    public BankTransaction(long trxValue) {
        valid(trxValue);
        this.trxValue = trxValue;
        counter++;
        sumOfTrxs = sumOfTrxs.add(new BigDecimal(Long.toString(trxValue)));
        if (trxValue < currentMinValue){
            currentMinValue = trxValue;
        }
        if (trxValue > currentMaxValue){
            currentMaxValue = trxValue;
        }

    }

    public static void initTheDay(){
        counter = 0;
        sumOfTrxs = new BigDecimal("0");
        currentMinValue = MAX;
        currentMaxValue = MIN;
    }

    public static BigDecimal averageOfTransaction(){
        return counter == 0 ? new BigDecimal("0") : sumOfTrxs.divide(new BigDecimal(Integer.toString(counter)),0, RoundingMode.HALF_UP );
    }


    public static long getCurrentMinValue() {
        return counter == 0 ? 0 : currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return counter == 0 ? 0 : currentMaxValue;
    }

    public static BigDecimal getSumOfTrxs() {
        return counter == 0 ? new BigDecimal("0") : sumOfTrxs;
    }

    public long getTrxValue() {
        return trxValue;
    }

    private void valid(long trxValue){
        if (MIN > trxValue || MAX < trxValue){
            throw new IllegalArgumentException("Az összeg a tranzakció határokon kívül esik:" + trxValue);
        }
    }

}

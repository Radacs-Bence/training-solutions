package typeconversion.dataloss;

public class DataLoss {

    public void dataLoss() {
        long number = 0;
        for (int i = 0; i <3;){
            long conversion = (long) (float) number;
            if(number != conversion){
                System.out.println("Szám: " + number + " Binárisan: " + Long.toBinaryString(number)
                        + "\n" + "Átconvertált: " + conversion + " Binárisan: " + Long.toBinaryString(conversion)
                        + "\n" + "Különbség: " + Math.abs(number - conversion) + " Binárisan: " + Long.toBinaryString(Math.abs(number - conversion)) + "\n");
                i++;
            }
            number++;
        }
    }

    public static void main(String[] args) {
        new DataLoss().dataLoss();
    }


}

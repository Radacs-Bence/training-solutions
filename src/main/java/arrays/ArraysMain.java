package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public String numberOfDaysAsString(){
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(months);
    }

    public List<String> daysOfWeek(){
        String[] week = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
        return Arrays.asList(week);
    }

    public String multiplicationTableAsString(int size){
            int[][] table = new int[size][size];
            for (int i = 0; i<size; i++){
                for (int k = 0; k <size; k++){
                    table[i][k] = (i + 1) * (k+1);
                }
            }
            return Arrays.deepToString(table);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay){
        return Arrays.equals(day, anotherDay);
    }

    public boolean wonLottery(int[] ticket, int[] lottery){
            int[] ticketCopy = Arrays.copyOf(ticket, ticket.length);
            int[] lotteryCopy = Arrays.copyOf(lottery, lottery.length);
            Arrays.sort(ticketCopy);
            Arrays.sort(lotteryCopy);
            return Arrays.equals(ticketCopy, lotteryCopy);
    }

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay){
        int a;
        if (day.length < anotherDay.length){
            a = day.length;
        } else {
            a = anotherDay.length;
        }
        double[] dayCopy = Arrays.copyOf(day, a);
        double[] anotherDayCopy = Arrays.copyOf(anotherDay, a);
        return Arrays.equals(dayCopy, anotherDayCopy);
    }

    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();

        System.out.println(arraysMain.numberOfDaysAsString() + "\n");

        System.out.println(arraysMain.daysOfWeek()+ "\n");

        System.out.println(arraysMain.multiplicationTableAsString(5)+ "\n");

        double[] day1 = {17.0, 21.5, 19.6, 22.4};
        double[] day2 = {17.0, 21.5, 19.6, 22.4};
        double[] day3 = {17.1, 21.5, 19.6, 22.4} ;
        System.out.println(arraysMain.sameTempValues(day1, day2));
        System.out.println(arraysMain.sameTempValues(day1, day3)+ "\n");


        int[] ticketWin = new int[]{1, 23, 34, 55, 99};
        int[] ticketLoose = new int[]{2, 23, 34, 55, 99};
        int[] lottery = new int[]{23, 99, 1, 55, 34};
        System.out.println(arraysMain.wonLottery(ticketWin, lottery));
        System.out.println(arraysMain.wonLottery(ticketLoose, lottery));
        System.out.println(Arrays.toString(lottery) + "\n");

        double[] day4 = {17.0, 21.5, 19.6, 22.4};
        double[] day5 = {17.0, 21.5, 19.6};
        double[] day6 = {17.1, 21.5, 19.6} ;
        System.out.println(arraysMain.sameTempValuesDaylight(day4, day5));
        System.out.println(arraysMain.sameTempValuesDaylight(day5, day4));
        System.out.println(arraysMain.sameTempValuesDaylight(day4, day6));

    }

}

package array;

public class ArrayMain {

    public static void main(String[] args) {

        String[] week = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
        System.out.println(week[1]);
        System.out.println(week.length);

        int[] twoPower = new int[5];
        twoPower[0]=1;

        for (int i = 1; i<twoPower.length; i++){
            twoPower[i]=twoPower[i-1]*2;
        }

        for (int i = 0; i<twoPower.length; i++){
            System.out.print(twoPower[i] + " ");
        }

        System.out.println("");

        boolean[] alternating = new boolean[6];

        for (int i = 0; i<alternating.length; i++){
            alternating[i] = (i % 2) == 1;
        }

        for (int i = 0; i<alternating.length; i++){
            System.out.print(alternating[i] + " ");
        }


    }


}

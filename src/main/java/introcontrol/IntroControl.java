package introcontrol;

public class IntroControl {

    public int substractTenIfGreaterThanTen(int number){
        if(number > 10){
            return number-10;
        }else{
            return number;
        }
    }

    public String describeNumber(int number){
        if(number == 0){
            return "zero";
        } else{
            return "not zero";
        }
    }

    public String greetingToJoe(String name){
        if ("Joe".equals(name)){
            return "Hello Joe";
        } else{
            return "";
        }
    }

    public int calculateBonus(int sale){
        if (sale >= 1_000_000){
            return (sale * 10) / 100;
        } else {
            return 0;
        }
    }

    public int calculateConsumption(int prev, int next){
        if (prev < next){
            return next - prev;
        } else {
            return (10_000 + next) - prev;
        }
    }

    public void printNumbers(int max){
        for( int i = 0; i <= max; i++){
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public void printNumbersBetween(int min, int max){
        for( int i = min; i <= max; i++){
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public void printNumbersBetweenAnyDirection(int a, int b){
        if (a<b){
            for (int i = a; i <= b; i++){
                System.out.print(i + " ");
            }
        } else{
            for (int i = a; i >= b; i--){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    public void printOddNumbers(int max){
        for( int i = 0; i <= max; i=i+2){
            System.out.print(i + " ");
        }
        System.out.println("");
    }

}

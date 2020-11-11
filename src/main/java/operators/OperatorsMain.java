package operators;

public class OperatorsMain {

    public static void main(String[] args) {

        Operators operators = new Operators();

        System.out.println(operators.isEven(9));
        System.out.println(operators.isEven(10));
        System.out.println();

        System.out.println(16 >>1);
        System.out.println(16 <<1);
        System.out.println(13 >>1);
        System.out.println(13 <<1);
        System.out.println();

        System.out.println(operators.multiplyByPowerOfTwo(10, 5));
        System.out.println(operators.multiplyByPowerOfTwo(10, 6));
        System.out.println(operators.multiplyByPowerOfTwo(11, 5));
        System.out.println();

        System.out.println(0333);



    }

}

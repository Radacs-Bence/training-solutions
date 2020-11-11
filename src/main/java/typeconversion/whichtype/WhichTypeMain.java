package typeconversion.whichtype;

public class WhichTypeMain {

    public static void main(String[] args) {

        WhichType whichType = new WhichType();

        System.out.println(0 + ": " + whichType.whichType(Long.toString(0)));

        System.out.println(Byte.MAX_VALUE + ": " + whichType.whichType(Long.toString((long)Byte.MAX_VALUE )));

        System.out.println(Short.MAX_VALUE + ": " + whichType.whichType(Long.toString((long)Short.MAX_VALUE)));

        System.out.println(Integer.MAX_VALUE + ": " + whichType.whichType(Long.toString((long)Integer.MAX_VALUE)));

        System.out.println(Long.MAX_VALUE + ": " +whichType.whichType(Long.toString(Long.MAX_VALUE )));

    }
}

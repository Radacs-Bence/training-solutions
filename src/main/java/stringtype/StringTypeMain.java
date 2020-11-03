package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message= message + 444;
        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");
        System.out.println(b + " " + c);
        String emptyFirst = "";
        String emptySecond = "";
        String doubleEmpty = emptyFirst + emptySecond;
        System.out.println(doubleEmpty);
        System.out.println(doubleEmpty.length());
        String text = "Abcde";
        System.out.println(text.length() + "\r\n" +  text.substring(0,1) + "," + text.substring(2,3)+ "\r\n" +  text.substring(0,3));

    }
}

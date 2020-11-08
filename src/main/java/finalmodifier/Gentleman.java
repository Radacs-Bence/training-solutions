package finalmodifier;

public class Gentleman {

    private static final String MESSAGE_PREFIX = "Jó napod kívánok, ";
    private String name;

    public Gentleman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sayHello(String name){
        return MESSAGE_PREFIX + name + "!";
    }

    public static void main(String[] args) {

        Gentleman gentleman = new Gentleman("Mákos Huba");

        System.out.println(gentleman.sayHello(gentleman.getName()));

    }

}

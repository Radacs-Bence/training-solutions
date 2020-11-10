package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {

        Person personOne;
        Person personTwo;

        personOne = new Person("Gipsz Jakab", 40);
        personTwo = personOne;

        personTwo.setName("Gipsz József");

        System.out.println(personOne.getName() + ", " + personOne.getAge() +
                "\n" + personTwo.getName() + ", " + personTwo.getAge());

        int numberOne = 24;
        int numberTwo = numberOne;

        numberTwo++;

        System.out.println(numberOne + ", " + numberTwo);

        personTwo = new Person("Kovács Piroska", 29);
        System.out.println(personOne.getName() + ", " + personOne.getAge() +
                "\n" + personTwo.getName() + ", " + personTwo.getAge());


    }

}

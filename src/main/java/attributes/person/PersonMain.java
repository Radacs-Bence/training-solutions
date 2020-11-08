package attributes.person;

public class PersonMain {

    public static void main(String[] args) {

        PersonMain personMain = new PersonMain();

        Person person = new Person("Gips Jakab", "a1b2c3d4");
        Address address = new Address("MAgyarország", "Budapes", "Pacsirta utca 22.", "1029");
        person.moveTo(address);
        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString() + "\n");

        person.correctData("Gipsz Jakab", "a1b2c3d4e");
        person.getAddress().correctData("Magyarország", "Budapest", "Pacsirta utca 22.", "1027");
        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString() + "\n");

        Address newAddress = new Address("Magyarország", "Budapest", "Etele út 48/b",  "1119");
        person.moveTo(newAddress);
        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());

    }
}

package week12d04;

import java.util.Objects;

public class Client {

    private final String name;
    private final String regNumber;


    public Client(String name, String regNumber) {
        this.name = name;
        this.regNumber = regNumber;
    }

    public String getName() {
        return name;
    }

    public String getRegNumber() {
        return regNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(regNumber, client.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", regNumber='" + regNumber + '\'' +
                '}';
    }
}

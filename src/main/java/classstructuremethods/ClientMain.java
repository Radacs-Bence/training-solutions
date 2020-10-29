package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Tas H. Töhötöm");
        client.setYear(811);
        client.setAddress("Etelköz");
        System.out.println( "Név: " + client.getName() + "\r\n" + "Születési év: " + client.getYear()+ "\r\n" +"Lakcím: " + client.getAddress());

        client.migrate("Kárpát-medence");
        System.out.println("Elköltözött! \r\nÚj lakcím: " + client.getAddress());
    }
}

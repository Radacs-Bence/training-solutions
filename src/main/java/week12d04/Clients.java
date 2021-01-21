package week12d04;

import java.util.*;

public class Clients {

    Map<String, Client> clientMap = new HashMap<>();

    public void addClient(String name, String regNumber) {
        clientMap.put(regNumber, new Client(name, regNumber));
    }

    public Client findByRegNumber(String regNumber) {
        if (!clientMap.containsKey(regNumber)) {
            throw new IllegalArgumentException("No such Registration Number found!");
        }
        return clientMap.get(regNumber);
    }

    public List<Client> findByName(String name) {
        List<Client> found = new ArrayList<>();
        Collection<Client> toSearch = clientMap.values();
        for (Client client : toSearch) {
            if (client.getName().contains(name)) {
                found.add(client);
            }
        }
        return found;
    }

}

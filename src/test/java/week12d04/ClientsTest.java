package week12d04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientsTest {

    Clients clients;

    @BeforeEach
    void setUp() {
        clients = new Clients();
        clients.addClient("Gipsz Jakab", "a1");
        clients.addClient("Gipsz Jónás", "a2");
        clients.addClient("Kis Piroska", "b1");
    }

    @Test
    void findByRegNumber() {
        Client result = clients.findByRegNumber("b1");
        assertEquals("Kis Piroska", result.getName());

    }

    @Test
    void findByName() {
        List<Client> expected = new ArrayList<>();
        expected.add(new Client("Gipsz Jakab", "a1"));
        expected.add(new Client("Gipsz Jónás", "a2"));

        List<Client> result = clients.findByName("Gipsz");

        assertEquals(expected.toString(), result.toString());

    }
}
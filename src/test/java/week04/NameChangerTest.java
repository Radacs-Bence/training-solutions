package week04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameChangerTest {

    @Test
    void Change() {
        NameChanger nc = new NameChanger("Gipsz Jakab");
        nc.changeFirstName("Jákob");
        assertEquals("Gipsz Jákob", nc.getFullName());
    }
}

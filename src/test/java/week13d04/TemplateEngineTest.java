package week13d04;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import week13d02.ResultsReader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TemplateEngineTest {


    @Test
    void mergeTest() throws IOException {
        Writer sw = new StringWriter();


        Map<String, Object> toChange = new HashMap<>();
        toChange.put("nev", "Gipsz Jakab");
        toChange.put("datum", LocalDate.of(2021, 01, 28));
        toChange.put("osszeg", 10_000_000L);
        toChange.put("hatarido", LocalDate.of(2021, 01, 29));

        TemplateEngine templateEngine = new TemplateEngine();

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(TemplateEngine.class.getResourceAsStream("email.txt")));
            BufferedWriter writer = new BufferedWriter(sw)) {


            templateEngine.merge(reader, toChange, writer);
        } catch (Exception e) {
            throw new IllegalStateException("Cannot read file", e);
        }
        System.out.println(sw.toString());

        String text = """
                Kedves Gipsz Jakab!
                Megküldjük önnek a következő esedékes számláját 2021-01-28 dátummal,
                melynek összege: 10000000 Ft!
                A fizetési határidő 2021-01-29.
                Üdvözlettel,
                Ügyfélszolgálat
                        """;
        assertEquals(text, sw.toString());
    }

}
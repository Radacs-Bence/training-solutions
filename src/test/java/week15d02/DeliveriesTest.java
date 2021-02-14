package week15d02;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class DeliveriesTest {

    Deliveries deliveries = new Deliveries();



    @Test
    void getOrders() {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(Deliveries.class.getResourceAsStream("/orders.txt")))){
            deliveries.readFile(reader);
        } catch(IOException e){
            e.printStackTrace();
        }
        assertEquals("Order{currier='FUT_1', address='1113 Eszterházy 15', time=17:32}",
                deliveries.getOrders().get(LocalDate.of(2020, 12, 04)).get(0).toString());
    }

    @Test
    void fewestOrdersDate() {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(Deliveries.class.getResourceAsStream("/orders.txt")))){
            deliveries.readFile(reader);
        } catch(IOException e){
            e.printStackTrace();
        }
        assertEquals("2020-12-03", deliveries.fewestOrdersDate().toString());
    }

    @Test
    void getOrderByTime() {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(Deliveries.class.getResourceAsStream("/orders.txt")))){
            deliveries.readFile(reader);
        } catch(IOException e){
            e.printStackTrace();
        }
        assertEquals("Optional[Order{currier='FUT_1', address='1113 Petőfi 12', time=12:30}]",
                deliveries.getOrderByTime(LocalDateTime.parse("2020.12.01:12:30", DateTimeFormatter.ofPattern("yyyy.MM.dd:HH:mm"))).toString());
    }

    @Test
    void statistics() {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(Deliveries.class.getResourceAsStream("/orders.txt")))){
            deliveries.readFile(reader);
        } catch(IOException e){
            e.printStackTrace();
        }
        assertEquals("{FUT_1=7, FUT_4=2, FUT_2=5, FUT_3=2}", deliveries.statistics().toString());
    }

    @Test
    void mostOrdersAddress() {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(Deliveries.class.getResourceAsStream("/orders.txt")))){
            deliveries.readFile(reader);
        } catch(IOException e){
            e.printStackTrace();
        }
        assertEquals("1114 Kossuth 9", deliveries.mostOrdersAddress());
    }
}
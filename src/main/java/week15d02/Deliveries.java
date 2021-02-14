package week15d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Deliveries {

    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy.MM.dd");
    public static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");

    private Map<LocalDate, List<Order>> orders = new HashMap<>();

    public void readFile(BufferedReader reader) throws IOException {
        String line;
        LocalDate date = null;
        String currier = "";
        String address = "";
        LocalTime time = null;

        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if (line.length() == 10) {
                date = LocalDate.parse(line, DATE_FORMATTER);
            } else if (line.startsWith("FUT")) {
                currier = line;
            } else {
                String[] parts = line.split(" ");
                address = parts[0] + " " + parts[1] + " " + parts[2];
                time = LocalTime.parse(parts[3], TIME_FORMATTER);
                LocalDate finalDate = date;
                Order order = new Order(currier, address, time);
                orders.computeIfAbsent(date, o -> new ArrayList<>()).add(order);
            }

        }


    }

    public LocalDate fewestOrdersDate() {
        LocalDate fewestDate = null;
        int min = Integer.MAX_VALUE;
        for (LocalDate key : orders.keySet()) {
            if (min > orders.get(key).size()) {
                min = orders.get(key).size();
                fewestDate = key;
            }
        }
        return fewestDate;
    }

    public Optional<Order> getOrderByTime(LocalDateTime dateTime) {
        List<Order> ordersOfDay = orders.get(dateTime.toLocalDate());
        for (Order order : ordersOfDay) {
            if (dateTime.toLocalTime().equals(order.getTime())) {
                return Optional.of(order);
            }
        }
        return Optional.empty();
    }

    public Map<String, Integer> statistics() {
        Map<String, Integer> result = new HashMap<>();
        for (LocalDate key : orders.keySet()) {
            List<Order> ordersOfDay = orders.get(key);
            for (Order order : ordersOfDay) {
                result.merge(order.getCurrier(), 1, Integer::sum);
            }
        }
        return result;
    }

    public String mostOrdersAddress() {
        Map<String, Integer> result = new HashMap<>();
        for (LocalDate key : orders.keySet()) {
            List<Order> ordersOfDay = orders.get(key);
            for (Order order : ordersOfDay) {
                result.merge(order.getAddress(), 1, Integer::sum);
            }
        }
        String maxAddress = orders.get(fewestOrdersDate()).get(0).getAddress(); // an address;

        for (String key : result.keySet()) {
            if (result.get(maxAddress) < result.get(key)){
                maxAddress = key;
            }
        }
        return maxAddress;
    }


    public Map<LocalDate, List<Order>> getOrders() {
        return Map.copyOf(orders);
    }

    public static void main(String[] args) {
        Deliveries deliveries = new Deliveries();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Deliveries.class.getResourceAsStream("/orders.txt")))) {
            deliveries.readFile(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(deliveries.getOrders());
        System.out.println(deliveries.fewestOrdersDate());
        System.out.println(deliveries.statistics());
        System.out.println(deliveries.mostOrdersAddress());

    }

}

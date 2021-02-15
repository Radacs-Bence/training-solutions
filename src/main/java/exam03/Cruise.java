package exam03;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers;

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
        this.passengers = new ArrayList<>();
    }

    public void bookPassenger(Passenger buyer) {
        if (passengers.size() >= boat.getMaxPassengers()) {
            throw new IllegalArgumentException("The boat is full.");
        } else {
            passengers.add(buyer);
        }
    }

    public double getPriceForPassenger(Passenger searched) {

        return searched.getCruiseClass().getMultiplier() * basicPrice;
    }

    public Passenger findPassengerByName(String name) {
        Passenger found = null;
        for (Passenger passenger : passengers) {
            if (passenger.getName().equals(name)) {
                found = passenger;
            }
        }
        return found;
    }

    public List<String> getPassengerNamesOrdered() {
        return passengers.stream()
                .map(Passenger::getName)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }

    public double sumAllBookingsCharged() {
        double sum = 0.0;
        for (Passenger passenger : passengers) {
            sum += getPriceForPassenger(passenger);
        }
        return sum;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        Map<CruiseClass, Integer> passengersByClass = new HashMap<>();
        for (Passenger passenger : passengers) {
            passengersByClass.merge(passenger.getCruiseClass(), 1, Integer::sum);
        }
        return passengersByClass;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return new ArrayList<>(passengers);
    }
}

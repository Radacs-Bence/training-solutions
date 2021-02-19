package lambdacollectors;

import lambdaprimitives.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Cafe {

     private List<CoffeeOrder> orders;

    public Cafe() {
        orders = new ArrayList<>();
    }

    public Cafe(List<CoffeeOrder> orders) {
        this.orders = orders;
    }

    public void addOrder(CoffeeOrder order){
        orders.add(order);
    }

    public Map<CoffeeType, Long> getCountByCoffeeType(){
        return orders.stream()
                .flatMap(x -> x.getCoffeeList().stream())
                                        .collect(Collectors.groupingBy(Coffee::getType, Collectors.counting()));
    }

    public double getAverageOrder(){
        return orders.stream().collect(Collectors.averagingDouble(x -> x.getCoffeeList().size()));
    }
}

package introconstructors;

public class RestaurantMain {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Mosolygós keszeg", 10);


        System.out.println("Név: " + restaurant.getName() +
                "\nFérőhelyek: " + restaurant.getCapacity() + " fő" +
                "\nMenü: " + restaurant.getMenu());


    }

}

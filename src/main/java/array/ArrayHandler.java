package array;

public class ArrayHandler {

    boolean contains(int[] source, int itemToFind){
        for (int i = 0; i<source.length; i++){
            if (source[i] == itemToFind){
                return true;
            }
        }
        return false;
    }

    int find(int[] source, int itemToFind){
        for (int i = 0; i<source.length; i++){
            if (source[i] == itemToFind){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayHandler array = new ArrayHandler();

        int[] numbers = {2, 4, 9, 11, 5, 32, -5};

        System.out.println("Tartalmazza-e?");
        System.out.println("Az 5-öt: " + array.contains(numbers,5));
        System.out.println("Az 40-et: " + array.contains(numbers,40));

         System.out.println("\n" + "Hol van?");
        System.out.println("Az 5: " + array.find(numbers,5));
        System.out.println("A 4: " + array.find(numbers,4));
        System.out.println("A 23: " + array.find(numbers,23));

    }

}

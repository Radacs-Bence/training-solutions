package arrayofarrays;

public class ArrayOfArraysMain {

    public int[][] multiplicationTable(int size){
        int[][] table = new int[size][size];
        for (int i = 0; i<size; i++){
            for (int k = 0; k <size; k++){
                table[i][k] = (i + 1) * (k+1);
            }
        }
        return table;
    }

    public void printArrayOfArrays(int[][] a){
        int largest = 0;

        for (int i = 0; i<a.length; i++){
            for (int k = 0; k<a[i].length; k++){
                if(largest < a[i][k]){
                    largest = a[i][k];
                }
            }
        }
        int rowDistance=1;

        for(int i = largest; i > 9; i = (i / 10)){
            rowDistance++;
        }

        for (int i = 0; i<a.length; i++){
            for (int k = 0; k < a[i].length; k++) {

                String space = " ";
                int distanceBetweenNumbers = rowDistance;

                for(int j = 1; j <= a[i][k]; j = (j * 10)){
                    distanceBetweenNumbers--;
                }

                for (int l = 1; l <= distanceBetweenNumbers; l++){
                    space = space + " ";
                }

                System.out.print(a[i][k] + space);
            }
            System.out.print("\n");
        }
    }

    public int[][] triangularMatrix(int size){
        int[][] triangle = new int[size][];
        for (int i =0; i < size; i++){
            triangle[i] = new int[i+1];
            for (int k =0; k <= i; k++){
                triangle[i][k] = i+1;
            }
        }
        return triangle;
    }

    public int[][] getValues(){
        int[][] year = new int[12][];
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i =0; i < year.length; i++){
            year[i] = new int[months[i]];
        }
        return year;
    }

    public static void main(String[] args) {
        ArrayOfArraysMain arrayArrays = new ArrayOfArraysMain();

        arrayArrays.printArrayOfArrays(arrayArrays.multiplicationTable(10));
        arrayArrays.printArrayOfArrays(arrayArrays.triangularMatrix(10));
        arrayArrays.printArrayOfArrays(arrayArrays.getValues());


    }
}

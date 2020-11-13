package week03;

public class Operation {

    private int left;
    private int right;

    public Operation(String addition) {
        int plusIndex = addition.indexOf("+");
        this.left = Integer.parseInt(addition.substring(0, plusIndex));
        this.right =Integer.parseInt(addition.substring(plusIndex +1)) ;
    }

    public int getResult(){
        return left + right;
    }



}

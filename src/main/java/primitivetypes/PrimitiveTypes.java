package primitivetypes;

public class PrimitiveTypes {

   public String toBinaryString (int n){
        String text = "";
        for (int i =31; i >= 0; i--){
            if(n < Math.pow(2, i)){
                text += "0";
            }else {
                n = (int) (n % Math.pow(2, i));
                    text += "1";
            }
        }
        return text;
    }

    public static void main(String[] args) {
        PrimitiveTypes primitiveTypes = new PrimitiveTypes();

       System.out.println(primitiveTypes.toBinaryString(99));
    }

}

package introexception.patient;

public class SsnValidator {

    public boolean isValidSsn(String socialSecurityNumber){
        boolean isValid = false;
        int validityNumber = 0;
        try {
            if (socialSecurityNumber.length() == 9){
                for (int i = 0; i < socialSecurityNumber.length()-1; i ++){
                    int number = Integer.parseInt(socialSecurityNumber.substring(i, i+1)) ;
                    if (i % 2 == 0){
                        number *= 3;
                    }
                    if (i % 2 == 1){
                        number *= 7;
                    }
                    validityNumber += number;
                }

                if (validityNumber % 10 == Integer.parseInt(socialSecurityNumber.substring(8))){
                    isValid = true;
                }
            }
        } catch (NumberFormatException abc) {
           isValid = false;
        }
        return isValid;
    }
}

package stringtype.registration;

public class UserValidator {

    public boolean isValidUsername(String username){
        return !"".equals(username);
    }

    public boolean isValidPassword(String password1, String password2){
        return password1.length()>8 && password1.equals(password2);
    }

    public boolean isValidEmail(String email){
        int atPlace = email.indexOf('@');
        int dotPlace = email.indexOf('.');
        int emailLength= email.length();
        return atPlace > 0
                && dotPlace != -1
                && dotPlace < emailLength
                && (dotPlace - atPlace) > 1 ;
    }

}

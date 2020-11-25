package week05d03;

import java.util.List;

public class UserValidator {

    public void  userValidator (List<User> users){
        boolean valid = true;
        String text = null;
        for (User user: users) {
            if (user.getName().isBlank() || user.getName() == null){
                valid = false;
                text = "A név mező üres";
            }
            if (user.getAge() >= 0 && user.getAge() < 120){
                valid = false;
                text = "A felhasználó életkora nem megfelelő";
            }
        }
        if (!valid){
            throw new IllegalArgumentException (text);
        }
    }

}

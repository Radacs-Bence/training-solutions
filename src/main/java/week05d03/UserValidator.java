package week05d03;

import java.util.List;

public class UserValidator {

    public void  userValidator (List<User> users){
        boolean valid = true;
        String text = "";
        if (users == null){
            valid = false;
            text = "A users lista null!";
        } else {
            for (User user : users) {
                if (user == null){
                    valid = false;
                    text = "A user elem null!";
                } else {
                    if (user.getName() == null || user.getName().isBlank()) {
                        valid = false;
                        text += "A név mező üres! ";
                    }
                    if (user.getAge() < 0 || user.getAge() >= 120) {
                        valid = false;
                        text += "A felhasználó életkora nem megfelelő! ";
                    }
                }
            }
        }
        if (!valid){
            throw new IllegalArgumentException (text);
        }
    }

}

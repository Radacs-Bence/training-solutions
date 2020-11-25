package week05d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserValidatorTest {

    @Test
    public void userValidatorNullList (){
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> new UserValidator().userValidator(null));
        assertEquals("A users lista null!", ex.getMessage());
    }

    @Test
    public void userValidatorEmptyList (){
        List<User> users = new ArrayList<>();
        users.add(null);
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> new UserValidator().userValidator(users));
        assertEquals("A user elem null!", ex.getMessage());
    }

    @Test
    public void userValidatorEmptyName (){
        List<User> users = new ArrayList<>();
        users.add(new User("", 60));
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> new UserValidator().userValidator(users));
        assertEquals("A név mező üres! ", ex.getMessage());
    }

    @Test
    public void userValidatorWrongAge (){
        List<User> users = new ArrayList<>();
        users.add(new User("Gipsz Jakab", 160));
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> new UserValidator().userValidator(users));
        assertEquals("A felhasználó életkora nem megfelelő! ", ex.getMessage());
    }

     @Test
    public void userValidatorBothWrong (){
        List<User> users = new ArrayList<>();
        users.add(new User("          ", 160));
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> new UserValidator().userValidator(users));
        assertEquals("A név mező üres! A felhasználó életkora nem megfelelő! ", ex.getMessage());
    }
}

package week07d02;

public class UserImpl implements User {

    String username;
    String firstName;
    String lastName;

    public UserImpl(String username, String firstName, String lastName) {
        if (isEmpty(username) || isEmpty(firstName) || isEmpty(lastName)){
            throw new IllegalArgumentException("One or more of the names is invalid!");
        }
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    private boolean isEmpty(String string) {
        return (string == null || string.isBlank());
    }

}

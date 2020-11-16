package week04;

public class NameChanger {

    private String fullName;


    private boolean isEmpty(String string) {
        return string == null || string.isBlank();
    }

    public NameChanger(String fullName) {
        if (isEmpty(fullName)){
            throw new IllegalArgumentException("Empty string!");
        }
        this.fullName = fullName;
    }

    public void changeFirstName(String newFirstname){
        int space = fullName.indexOf(' ');
        String oldFirstName = fullName.substring(space);
        fullName = fullName.replace(oldFirstName, " " + newFirstname);
    }

    public String getFullName() {
        return fullName;
    }
}

package introexception.patient;

public class Patient {
    public static final int MIN_YEAR = 1900;


    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {

        SsnValidator ssnValidator = new SsnValidator();

        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("A nevet ki kell tölteni!");
        }
        if (yearOfBirth <= 1990) {
            throw new IllegalArgumentException("Érvénytelen születési év!");
        }
        if (! ssnValidator.isValidSsn(socialSecurityNumber)){
            throw new IllegalArgumentException("Érvénytelen TAJ szám!");
        }

        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }


}

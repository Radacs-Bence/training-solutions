package stringconcat.stringconcat;

public class Name {

    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        if (familyName == null || givenName ==null || familyName.isBlank() || givenName.isBlank()){
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public Name(String familyName, String middleName, String givenName) {
        if (familyName == null || givenName ==null || familyName.isBlank() || givenName.isBlank()){
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }


    public String concatNameWesternStyle(){
        String name = "";

        if (title != null) {
            name = name.concat(title.getTitle());
            name = name.concat(" ");
        }
        name = name.concat(givenName);
        name = name.concat(" ");
        if (middleName != null && !middleName.isBlank()){
            name = name.concat(middleName);
            name = name.concat(" ");

        }
        name = name.concat(familyName);
        return name;
    }
    public String concatNameHungarianStyle() {
        String name = "";

        if (title != null) {
            name += title.getTitle() + " ";
        }
        name += familyName + " ";
        if (middleName != null && !middleName.isBlank()) {
            name += middleName + " ";
        }
        name += givenName;
        return name;
    }
}

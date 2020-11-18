package stringbuilder;

public class NameBuilder {




    public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title){
        if (isEmpty(familyName) || isEmpty(givenName)){
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        StringBuilder westernName = new StringBuilder();

        if (title != null){
            String titleAsString = title.getTitle();
            westernName.append(titleAsString).append(" ");
        }

        westernName.append(givenName).append(" ");

        if (!isEmpty(middleName)){
            westernName.append(middleName).append(" ");
        }

        westernName.append(familyName);

        return westernName.toString();
    }

    public String concatNameHungarianStyle(String familyName, String middleName, String givenName, Title title){
        if (isEmpty(familyName) || isEmpty(givenName)){
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        StringBuilder hunName = new StringBuilder();

        if (title != null){
            String titleAsString = title.getTitle();
            hunName.append(titleAsString).append(" ");
        }

        hunName.append(familyName).append(" ");

        if (!isEmpty(middleName)){
            hunName.append(middleName).append(" ");
        }

        hunName.append(givenName);

        return hunName.toString();
    }

    public String insertTitle(String name, Title title, String where){
        StringBuilder insertion = new StringBuilder(title.getTitle());
        insertion.append(" ");
        int position = name.indexOf(where) +1;
        return new StringBuilder(name).insert(position, insertion).toString();
    }

    public String deleteNamePart(String name, String delete){
        int start = new StringBuilder(name).indexOf(delete);
        return new StringBuilder(name).delete(start, start + delete.length()).toString();
    }


    private boolean isEmpty(String string) {
        return string == null || string.isBlank();
    }



}

package schoolrecords;

public class Subject {

    private String SubjectName;

    public Subject(String subjectName) {
        SubjectName = subjectName;
    }

    public String getSubjectName() {
        return SubjectName;
    }

   /*  public boolean equals(String object){
        boolean equals = false;
        if (getSubjectName().equals(object)){
            equals = true;
        }
        return equals;
    }*/
}

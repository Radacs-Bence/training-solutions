package stringbuilder;

public enum Title {

    MR("Mr."), MRS("Mrs."), MS("Ms."), DR("Dr."), PROF("Prof.");

    private String title;

    Title(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

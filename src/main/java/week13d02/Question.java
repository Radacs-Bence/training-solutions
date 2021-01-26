package week13d02;

public class Question {

    private final String id;
    private final String answer;
    private final int index;

    public Question(String id, String answer, int index) {
        this.id = id;
        this.answer = answer;
        this.index = index;
    }

    public String getId() {
        return id;
    }

    public String getAnswer() {
        return answer;
    }

    public int getIndex() {
        return index;
    }
}

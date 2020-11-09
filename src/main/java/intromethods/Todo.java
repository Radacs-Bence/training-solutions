package intromethods;

public class Todo {

    private String caption;
    private boolean finished;

    public Todo(String caption) {
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }

    public boolean isFinished() {
        return finished;
    }

    public void finish() {
        this.finished = true;
    }

    public String finishTranslator(){
        String text;
        if (isFinished() == true){
            text = " (Befejezve)";
        } else {
            text = " (Megcsinálandó)";
        }
        return text;
    }

    @Override
    public String toString() {
        return caption + finishTranslator();
    }
}

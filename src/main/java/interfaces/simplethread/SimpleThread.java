package interfaces.simplethread;

import java.util.List;

public class SimpleThread implements Runnable{

    private List<String> tasks;

    public SimpleThread(List<String> tasks) {
        this.tasks = tasks;
    }

    public List<String> getTasks() {
        return List.copyOf(tasks);
    }

    private boolean nextStep(){
        if (tasks.isEmpty()){
            return false;
        }
        tasks.remove(tasks.get(tasks.size()-1));
        return true;
    }

    @Override
    public void run() {
        while (nextStep());
    }
}

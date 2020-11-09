package intromethods;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Todo> todos = new ArrayList<>();

    public void addTodo(String caption){
        todos.add(new Todo(caption));
    }

    public void finishTodos(String caption){
        for (Todo todo: todos) {
            if (todo.getCaption().equals(caption)) {
                todo.finish();
            }
        }
    }

    public void finishAllTodos(List<String> todosToFinish) {
        for (String todo: todosToFinish) {
            finishTodos(todo);
        }
    }

    public List<String> todosToFinish() {
        List<String> unFinished = new ArrayList<>();
        for (Todo todo: todos) {
            if (todo.isFinished() == false) {
                String text = todo.getCaption();
                unFinished.add(text);
            }
        }
        return unFinished;
    }

    public int numberOfFinishedTodos(){
        int counter = 0;
        for (Todo todo: todos) {
            if (todo.isFinished() == true) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public String toString() {
        return todos.toString();
    }
}

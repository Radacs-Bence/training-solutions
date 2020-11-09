package intromethods;

import java.util.Arrays;

public class TodoListMain {

    public static void main(String[] args) {

        TodoList todoList = new TodoList();

        todoList.addTodo("Bevásárlás");
        todoList.addTodo("Ebéd Főzése");
        todoList.addTodo("Mosogatást berakni");
        todoList.addTodo("Takaritás");
        todoList.addTodo("Edzés");
        todoList.addTodo("Anyát felhívni");
        todoList.addTodo("Mosást berakni");

        System.out.println(todoList);
        System.out.println(todoList.numberOfFinishedTodos());
        System.out.println(todoList.todosToFinish() + "\n");


        todoList.finishTodos("Bevásárlás");

        System.out.println(todoList);
        System.out.println(todoList.numberOfFinishedTodos());
        System.out.println(todoList.todosToFinish() + "\n");


        todoList.finishAllTodos(Arrays.asList("Ebéd Főzése", "Mosogatást berakni", "Anyát felhívni"));

        System.out.println(todoList);
        System.out.println(todoList.numberOfFinishedTodos());
        System.out.println(todoList.todosToFinish());

    }

}

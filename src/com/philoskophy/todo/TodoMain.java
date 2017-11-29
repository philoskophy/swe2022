
package com.philoskophy.todo;

public class TodoMain {
    public static void main(String[] args) {

        App skproject = new App("skproject");
        TodoList l1 = new TodoList("과제");
        skproject.addTodoList(l1);
        TodoTask t1 = new TodoTask("자바입문 Lesson9");
        l1.addTask(t1);


        String app0 = skproject.getTodoList().toString();
        System.out.println(app0);





    }
}


package com.philoskophy.todo;

public class TodoMain {
    public static void main(String[] args) {

        App skproject = new App("skproject");
        TodoList l1 = new TodoList("과제");
        skproject.addTodoList(l1);
        TodoList l2 = new TodoList("자격증공부");
        skproject.addTodoList(l2);
        TodoTask t1a = new TodoTask("자바입문 Lesson9");
        l1.addTask(t1a);
        TodoTask t1b = new TodoTask("인공지능 문제풀이");
        l1.addTask(t1b);
        TodoTask t2a = new TodoTask("TOEIC");
        l2.addTask(t2a);

        int a = skproject.todoCategory.get(0).size(); //2가 나와야하는데 왜 0이 나오는지 모르겠음.
        skproject.showCategory();
    }
}

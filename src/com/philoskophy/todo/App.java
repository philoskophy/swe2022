package com.philoskophy.todo;

import java.util.ArrayList;

public class App {
    //변수
    public ArrayList<TodoList> todoCategory;
    final String userName;

    //생성자
    public App(String name) {
        this.userName = name;
        todoCategory = new ArrayList<TodoList>();
    }

    //메서드
    public void addTodoList(TodoList listname) {
        todoCategory.add(listname);
    }

    public void delTodoList(TodoList listname) {
        todoCategory.remove(listname);
    }

    public ArrayList<TodoList> getTodoList() {
        return this.todoCategory;
    }


}
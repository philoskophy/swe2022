package com.philoskophy.todo;

import java.util.ArrayList;

public class App {
    private ArrayList<TodoList> appTodoList;
    private String userName;

    public App(String name) {
        this.userName = name;
        appTodoList = new ArrayList<TodoList>();
    }

    public void addTodoList(TodoList listname) {
        appTodoList.add(listname);
    }

    public void delTodoList(TodoList listname) {
        appTodoList.remove(listname);
    }

    public ArrayList<TodoList> getTodoList() {
        return this.appTodoList;
    }


}

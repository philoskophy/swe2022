package com.philoskophy.todo;

import java.util.ArrayList;

public class TodoList {
    //변수
    private String listName;
    private TodoTheme listTheme;
    private ArrayList<TodoTask> todoTasks;


    //생성자
    public TodoList(String name) {
        this.listName = name;
        TodoTheme basicTheme = new TodoTheme();
        this.listTheme = basicTheme;
        this.todoTasks = new ArrayList<>();

    }

    //반환
    public String getListName() {
        return this.listName;
    }

    public TodoTheme getListTheme() {
        return listTheme;
    }

    public ArrayList<TodoTask> getTodoTask() {
        return this.todoTasks;
    }


    //메서드
    public void changeName(String name) {
        this.listName = name;
    }

    public void changeTheme(TodoTheme theme) {
        this.listTheme = theme;
    }

    public void addTask(TodoTask task) { this.todoTasks.add(task); }

    public void delTask(TodoTask task) {
        this.todoTasks.remove(task);
    }

//
    @Override
    public String toString() {

        return listName ;

    }


}

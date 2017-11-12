package com.philoskophy.todo;

import java.util.ArrayList;

public class TodoList {

    ArrayList<String> lists = new ArrayList<>();
    TodoTheme listTheme = new TodoTheme();
    TodoTask  listTask = new TodoTask();

    public void addList(String a){
        this.lists.add(a);
    }

    public void delList(int a){
        this.lists.remove(a);
    }

    public void getLists(){
        System.out.println("할일 목록입니다.");
        System.out.println("---------------------");
        for(int i = 0 ; i < this.lists.size() ; i++){
            System.out.println(lists.get(i));
        }
        System.out.println("---------------------");
    }
}

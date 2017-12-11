package com.philoskophy.todo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class App implements Serializable {
    private ArrayList<TodoList> appTodoList;
    public String appOwner;

    public App(String userName) {
        this.appOwner = userName;
        appTodoList = new ArrayList<TodoList>();
    }

    public void removeTodoList(TodoList list1) {
        appTodoList.remove(list1);
    }

    public void addTodoList(TodoList list1) {
        appTodoList.add(list1);
    }

    public void getTodoList() {
        for (TodoList a : this.appTodoList) {
            String b = a.getListname();
            System.out.println(b);
        }
    }

    public ArrayList<TodoList> getAppTodoList() {
        return appTodoList;
    }

    public String getAppOwner() {
        return appOwner;
    }

    public void viewTodoList() {
        for (TodoList a : this.appTodoList) {
            int sizeOfTodoList = a.getTodoTasks().size();
            String result = String.format("- %s %d", a.getListname(), sizeOfTodoList);
            System.out.println(result);
        }
    }

    public TodoList findAppTodoList(String aaa) {
        TodoList result = null;
        for (TodoList t : appTodoList) {
            boolean k = t.getListname().equals(aaa);
            if (k) {
                result = t;
            }
        }
        return result;
    }


    // 아래부터
    // 과제 요구 부분 지난주 과제 놓쳐서 i-campus 에 올려주신 모범코드를 우선 채용 후 save&load 구축
    // 코드 보는중인데 모르겠음..

    public void save() throws IOException {
        Path p = Paths.get("c:/test", "swe2022.txt");
        if (!Files.exists(p)) Files.createFile(p);
        ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(p));
        out.reset();
        out.writeObject(this);
        for (TodoList t1 : this.getAppTodoList()) {
            out.writeObject(t1);
            for (TodoTask t2 : t1.getTodoTasks()) {
                out.writeObject(t2);
            }
        }
    }

    public void load() throws IOException, ClassNotFoundException {

        Path p = Paths.get("c:/test","swe2022.txt");


        ObjectInputStream in = new ObjectInputStream(Files.newInputStream(p));
        App o1 = (App) in.readObject();
        this.appTodoList = o1.getAppTodoList();
        try{
            while(true){
                Object o2 = (Object) in.readObject();

                if (o2 instanceof TodoList) {

                    o2 = (TodoList) o2 ;

                    ((TodoList) o2).getTodoTasks();
                }

                else if (o2 instanceof TodoTask){
                    o2 = (TodoTask) o2;
                    }
            }
    }

    catch (FileNotFoundException e) {System.out.println("file not-existed");}

    catch (EOFException e) {System.out.println("file loaded");}

    catch (Exception e) {System.out.println("error");}

    }
}
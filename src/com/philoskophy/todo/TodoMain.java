
package com.philoskophy.todo;

import java.io.*;
import java.util.*;

public class TodoMain {
    public static void main(String[] arg) {

        App skproject = new App("skproject");


        Scanner in = new Scanner(System.in).useDelimiter("\\n");

        skproject.viewTodoList();

        while (true) {
            in.reset();
            TodoList workOnList = null;

            while (in.hasNextLine()) {
                String c = in.nextLine();
                if (c.startsWith("addList:")){
                    String newListName = c.substring(8).trim();
                    skproject.addTodoList(new TodoList(newListName));
                    skproject.viewTodoList();
                }

                if (c.startsWith("list:")){
                    String workOnListName = c.substring(5).trim();
                    workOnList = skproject.findAppTodoList(workOnListName);
                    try {workOnList.viewTodoTasks();}
                    catch(NullPointerException ex){
                        System.out.println("존재하지 않는 리스트");
                        throw new NullPointerException(); }
                    finally {
                        continue;
                    }
                }
                if (c.startsWith("addTodo:")){
                    String strTodoTask = c.substring(8).trim();
                    TodoTask todoTaskForAdding = TodoTask.stringsOfTodoTask(strTodoTask);
                    workOnList.addtoTodoTasks(todoTaskForAdding);
                    workOnList.viewTodoTasks();
                }

                if (c.startsWith("complete:")){
                    try{
                        String completeTaskName = c.substring(9).trim();
                        TodoTask completedTask = workOnList.findTodoTask(completeTaskName);
                        completedTask.setDone(true);}
                    catch (NullPointerException ex){System.out.println("존재하지 않는 task");
                        throw new NullPointerException();}finally {
                        workOnList.viewTodoTasks();
                        continue;
                    }
                }
                if (c.startsWith("incomplete:")){
                    try{
                        String incompleteTaskName = c.substring(11).trim();
                        TodoTask completedTask = workOnList.findTodoTask(incompleteTaskName);
                        completedTask.setDone(false);}
                    catch (NullPointerException ex){System.out.println("존재하지 않는 task");
                        throw new NullPointerException();}finally {
                        workOnList.viewTodoTasks();
                        continue;
                    }
                }



                if (c.startsWith("save")){
                    try{ skproject.save();} catch (IOException e) {
                        e.printStackTrace();
                    } finally {continue;}}


                if (c.startsWith("load")){
                    try{ skproject.load(); }
                    catch (Exception e) {
                        System.out.println("오류발생지점Demoload");
                        e.printStackTrace(); }
                    finally {
                        skproject.viewTodoList();
                        continue; }
                }




            }


        }
    }
}
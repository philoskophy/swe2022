package com.philoskophy.todo;

import java.util.Date;

public class TodoTask {
    //변수
    private String taskName;
    private Date deadline;
    private boolean isDone;
    private final Date GENERATED_DATE;


    //생성자
    public TodoTask(String taskName){

        this.taskName = taskName;
        this.isDone = false;
        this.GENERATED_DATE = new Date();
    }

    //반환
    public String getTaskName(){
        return this.taskName;
    }

    public Boolean checkDone() {
        return this.isDone;
    }

    public Date getGeneratedDate(){
        return this.GENERATED_DATE;
    }

    public Date getDeadline(){
        return this.deadline;
    }


    //메서드
    public void setDeadline(int yy, int mm, int dd){
        this.deadline = new Date();
        this.deadline.setYear(yy);
        this.deadline.setDate(dd);
        this.deadline.setMonth(mm);
    }

    public void setDone(boolean tf){
        this.isDone = tf;
    }

    public void setTaskName(String name){
        this.taskName = name;
    }

    @Override
    public String toString() {

        return "---" + taskName  ;

    }


}
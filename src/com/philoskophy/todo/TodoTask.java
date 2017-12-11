package com.philoskophy.todo;

import java.io.Serializable;
import java.util.Date;

public class TodoTask implements Serializable {
    private String taskname;
    private Date deadline;
    private boolean isDone;
    private final Date generatedDate;
    private Date reminderDate;

    public TodoTask(String taskname){

        this.taskname = taskname;
        this.isDone = false;
        this.generatedDate = new Date();
    }

    public static TodoTask stringsOfTodoTask(String strTodoTask){
        String[] stringsOfInfo = strTodoTask.split(",");
        TodoTask aaa = new TodoTask("");
        int a = stringsOfInfo.length;
        for (int i=0; i<a; i++) {
            switch (i) {
                case 0: /
                    aaa.setTaskName(stringsOfInfo[0]);
                    break;
                case 1:
                    String[] deadlineStr = stringsOfInfo[1].split("\\.");
                    int year1 = Integer.parseInt(deadlineStr[0]);
                    int month1 = Integer.parseInt(deadlineStr[1]);
                    int date1 = Integer.parseInt(deadlineStr[2]);
                    aaa.setDeadline(year1, month1, date1);
                    break;
                case 2:
                    String[] reminderStr = stringsOfInfo[1].split("\\.");
                    int year2 = Integer.parseInt(reminderStr[0]);
                    int month2 = Integer.parseInt(reminderStr[1]);
                    int date2 = Integer.parseInt(reminderStr[2]);
                    aaa.setReminderDate(year2,month2,date2);
            }
        }
        return aaa;
    }


    public void setDeadline (int year1, int month1, int date1){
        this.deadline = new Date();
        this.deadline.setYear(year1-1900);
        this.deadline.setMonth(month1-1);
        this.deadline.setDate(date1);
    }

    public void removeDeadline(){
        this.deadline = null;
    }

    public void setDone(boolean status){
        this.isDone = status;
    }

    public void setReminderDate(int year1, int month1, int date1){
        this.reminderDate = new Date();
        this.reminderDate.setYear(year1-1900);
        this.reminderDate.setDate(date1);
        this.reminderDate.setMonth(month1-1);
    }


    public void removeReminderDate(){
        this.reminderDate = null;
    }

    public boolean isAlarm(){
        if ( this.reminderDate == null) return false;
        if (this.deadline == null) return false;

        Date rightNow = new Date();

        boolean needToBeAlarmed1 = (rightNow.getYear() == reminderDate.getYear());
        boolean needToBeAlarmed2 = (rightNow.getMonth() == reminderDate.getMonth());
        boolean needToBeAlarmed3 = (rightNow.getDate() == reminderDate.getDate());

        return needToBeAlarmed1&&needToBeAlarmed2&&needToBeAlarmed3;
    }


    public void setTaskName(String settingname){
        this.taskname = settingname;
    }


    public String getTaskname(){
        return this.taskname;
    }
    public Date getGeneratedDate(){return this.generatedDate;}
    public Date getDeadline() {
        if (deadline == null) return null;
        return this.deadline;}

    public Date getReminderDate() {
        if (reminderDate == null) return null;
        return reminderDate;
    }

    public Boolean getdone() { return this.isDone; }


    private String forPrintTheDate(Date a){

        if (a == null) return "";

        int year1 = a.getYear() + 1900;
        int month1 = a.getMonth() + 1 ;
        int date1 = a.getDate();
        String yyyymmdd = year1 + "/" +month1 +"/" +date1;
        return yyyymmdd;

    }

    private void setHourMin(String DorR, int hour, int min){
        if (DorR =="D") {
            this.deadline.setHours(hour);
            this.deadline.setMinutes(min);}
        if (DorR =="R") {
            this.reminderDate.setHours(hour);
            this.reminderDate.setMinutes(min);}
    }

    public void viewTodoTask(){
        String doneCharacter;
        if (this.isDone) {
            doneCharacter = "O";
        }
        else{
            doneCharacter = "-";};
        String result = String.format("[%s] %s",doneCharacter, this.taskname );
        if (this.deadline != null) { result = result+" "+forPrintTheDate(this.deadline);};
        if (this.reminderDate != null) { result = result+", "+"알림";};
        System.out.println(result);
    }

    public void getTodoTaskInfo(){
        System.out.println("Taskname : " + this.getTaskname());
        System.out.println("deadline : " + this.forPrintTheDate(this.deadline));
        System.out.println("Is it done ? " + this.getdone());
        System.out.println("-------------------");

    }

    public static void main (String[] arg){
        TodoTask t10 = new TodoTask("yoyo");
        t10.getTodoTaskInfo();
        t10.setDeadline(2017,11,18);
        t10.setReminderDate(2017,11,17);
        t10.getTodoTaskInfo();
        System.out.println(t10.isAlarm());

    }

}
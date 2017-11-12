//앞으로 >>> TodoList , TodoTask , TodoTheme <<< 를 쓰자.
/*
TodoList
//필드들 >>> 이름 정렬방향 테마
TodoTask
// 필드들 >>>이름 완료여부 완료 날짜
TodoTheme
**************일요일까지*******************클래스 세개를 만들어보자 패키지는 도메인 거꾸로 com.philoskophy.todo.
 */
package com.philoskophy.todo;

public class TodoMain {


    public static void main(String[] args){

        TodoList testList = new TodoList();
        testList.addList("밥먹기");
        testList.addList("영화보기");
        testList.getLists();
        testList.delList(1);
        testList.getLists();



    }
}

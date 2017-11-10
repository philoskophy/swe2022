package lesson8;


import java.util.ArrayList;

public class List {
    static private ArrayList<String> names = new ArrayList<>();


    private String name;

    public List(String name) throws Exception {
        if (names.contains(name)) throw new Exception();
        this.name = name;
        names.add(this.name);
    }

    public void setName(String name) throws Exception {
        if (name == this.name) return;
        if (names.contains(name)) throw new Exception();
        names.remove(this.name);
        this.name = name;
        names.add(this.name);
    }


}

//앞으로 >>> TodoList , TodoTask , TodoTheme <<< 를 쓰자.
/*
TodoList
//필드들 >>> 이름 정렬방향 테마
TodoTask
// 필드들 >>>이름 완료여부 완료 날짜
TodoTheme
**************일요일까지*******************클래스 세개를 만들어보자 패키지는 도메인 거꾸로 com.philoskophy.todo.
 */
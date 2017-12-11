package com.philoskophy.todo;

import java.io.Serializable;

public class TodoTheme implements Serializable {
    public enum TodoThemeColor {BLUE, RED, PURPLE, GREEN, SKYBLUE}
    public enum TodoThemeImage {MOUNTAIN, SEOULTOWER, BUS, AIRPLANE, HOUSE, NTH}

    private TodoThemeImage themeImage;
    private TodoThemeColor themeColor;



    public TodoTheme(){
        themeImage = TodoThemeImage.MOUNTAIN;
        themeColor = TodoThemeColor.BLUE;
    }

    public TodoTheme(TodoThemeColor themeColor, TodoThemeImage themeImage){
        this.themeColor = themeColor;
        this.themeImage = themeImage;
    }


    public void settingThemeColor(TodoThemeColor a){
        this.themeColor = a;
    }

    public void settingThemeImage(TodoThemeImage b){
        this.themeImage = b;

    }



    @Override
    public String toString() {
        String TodoThemeInfo = themeColor.toString() + ", " + themeImage.toString();
        return TodoThemeInfo;
    }


    public TodoThemeColor getThemeColor() {
        return themeColor;
    }

    public TodoThemeImage getThemeImage() {
        return themeImage;
    }
}
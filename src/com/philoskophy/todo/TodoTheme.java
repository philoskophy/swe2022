package com.philoskophy.todo;

public class TodoTheme {
    public enum todoColor {BLACK, WHITE, GRAY}
    public enum todoImage {PIKACHU, APPLE, GALAXY}

    private todoColor themeColor;
    private todoImage themeImage;

    //BasicTheme
    public TodoTheme(){
        themeColor = todoColor.BLACK;
        themeImage = todoImage.PIKACHU;
    }

    //반환
    public todoColor getThemeColor() {
        return themeColor;
    }

    public todoImage getThemeImage() {
        return themeImage;
    }


    //메서드
    public void changeColor(todoColor color){
        this.themeColor = color;
    }

    public void changeImage(todoImage image){
        this.themeImage = image;

    }


}

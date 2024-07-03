package com.example.memo;

public class Note {
    private String text;
    private String theme;  // テーマはデフォルト値として設定

    public Note(String text, String theme) {
        this.text = text;
        this.theme = theme;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}

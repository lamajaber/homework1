package com.example.notesapp.Model;

public class Note {

   private String title,Description, date;
   private int color;

    public Note(String title, String description, String date, int color) {
        this.title = title;
        Description = description;
        this.date = date;
        this.color = color;
    }

    public Note(String title, String description, String date) {
        this.title = title;
        Description = description;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}

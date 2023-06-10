package com.example.lesson21.model;

public class Notebook {

    // поля сущности
    private String id;// поле идентификатора записи в блокноте
    private String title;// поле заголовка записи в блокноте
    private String description;// поле описания записи в блокноте

    //конструктор

    public Notebook(String id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

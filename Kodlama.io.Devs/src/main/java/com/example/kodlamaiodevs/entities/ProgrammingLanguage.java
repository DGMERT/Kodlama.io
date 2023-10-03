package com.example.kodlamaiodevs.entities;

public class ProgrammingLanguage {
    private String name;
    private int İd;

    public ProgrammingLanguage() {
    }

    public ProgrammingLanguage(String name, int id) {
        this.name = name;
        İd = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return İd;
    }

    public void setId(int id) {
        İd = id;
    }
}

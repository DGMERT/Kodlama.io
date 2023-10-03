package com.example.kodlamaiodevs.dataAccess.abstracts;

import com.example.kodlamaiodevs.entities.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguagesRepository {
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id);
    void add(ProgrammingLanguage programmingLanguage);
    void update(ProgrammingLanguage programmingLanguage);
    void delete(ProgrammingLanguage programmingLanguage);
}

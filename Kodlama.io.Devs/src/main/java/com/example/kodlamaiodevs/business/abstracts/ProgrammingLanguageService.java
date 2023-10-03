package com.example.kodlamaiodevs.business.abstracts;

import com.example.kodlamaiodevs.entities.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id);
    void add(ProgrammingLanguage programmingLanguage) throws Exception;
    void delete(ProgrammingLanguage programmingLanguage);
    void update(ProgrammingLanguage programmingLanguage);
}

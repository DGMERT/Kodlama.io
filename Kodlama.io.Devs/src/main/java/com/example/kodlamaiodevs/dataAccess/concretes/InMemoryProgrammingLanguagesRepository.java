package com.example.kodlamaiodevs.dataAccess.concretes;

import com.example.kodlamaiodevs.dataAccess.abstracts.ProgrammingLanguagesRepository;
import com.example.kodlamaiodevs.entities.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryProgrammingLanguagesRepository implements ProgrammingLanguagesRepository {
    List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguagesRepository() {
        programmingLanguages = new ArrayList<ProgrammingLanguage>();
        programmingLanguages.add(new ProgrammingLanguage("C#", 1));
        programmingLanguages.add(new ProgrammingLanguage("Python#", 2));
        programmingLanguages.add(new ProgrammingLanguage("Java#", 3));
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            if (programmingLanguage.getId() == id) {
                return programmingLanguage;
            }
        }
        return null;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);

    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage currentProgrammingLanguage = getById(programmingLanguage.getId());
        if (currentProgrammingLanguage != null) {
            currentProgrammingLanguage.setName(programmingLanguage.getName());
        }

    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        for (ProgrammingLanguage otherProgrammingLanguage : programmingLanguages) {
            if (otherProgrammingLanguage.getId() == programmingLanguage.getId()) {
                programmingLanguages.remove(programmingLanguage);
            }
        }

    }
}

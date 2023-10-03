package com.example.kodlamaiodevs.business.concretes;

import com.example.kodlamaiodevs.business.abstracts.ProgrammingLanguageService;
import com.example.kodlamaiodevs.dataAccess.abstracts.ProgrammingLanguagesRepository;
import com.example.kodlamaiodevs.entities.ProgrammingLanguage;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    ProgrammingLanguagesRepository programmingLanguagesRepository;

    public ProgrammingLanguageManager(ProgrammingLanguagesRepository programmingLanguagesRepository) {
        this.programmingLanguagesRepository = programmingLanguagesRepository;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguagesRepository.getAll();

    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return programmingLanguagesRepository.getById(id);
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) throws Exception {
        if (programmingLanguage.getName() == null) {
            throw new Exception("Programlama dili ismi boş olamaz.");
        }
        for (ProgrammingLanguage otherProgrammingLanguage : programmingLanguagesRepository.getAll()) {
            if (otherProgrammingLanguage.getName().equalsIgnoreCase(programmingLanguage.getName())) {
                throw new Exception("Programlama dili ismi tekrar edemez.");
            }
        }
        programmingLanguagesRepository.add(programmingLanguage);


    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        programmingLanguagesRepository.delete(programmingLanguage);

    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        programmingLanguagesRepository.update(programmingLanguage);

    }
}

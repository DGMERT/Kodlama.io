package com.example.kodlamaiodevs.webApi;

import com.example.kodlamaiodevs.business.abstracts.ProgrammingLanguageService;
import com.example.kodlamaiodevs.entities.ProgrammingLanguage;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/programmingLanguage")
public class ProgrammingLanguageController {
    private ProgrammingLanguageService programmingLanguageService;
    public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService){
        this.programmingLanguageService=programmingLanguageService;
    }
    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll(){
        return programmingLanguageService.getAll();
    }
    @DeleteMapping("/delete")
    public void delete(ProgrammingLanguage programmingLanguage){
        programmingLanguageService.delete(programmingLanguage);
    }
}

package com.example.springBootDemo.controller;

import com.example.springBootDemo.entity.Person;
import com.example.springBootDemo.repository.PersonReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class personController {
    @Autowired
    private PersonReposity personReposity;
    @GetMapping("/person")
    private List<Person> personList(){
        return personReposity.findAll();
    }
}

package com.example.springBootDemo.repository;

import com.example.springBootDemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonReposity extends JpaRepository<Person,Integer> {
}

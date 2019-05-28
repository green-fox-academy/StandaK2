package com.greenfox.listingtodosh2;

import com.greenfox.listingtodosh2.models.Todo;
import com.greenfox.listingtodosh2.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Listingtodosh2Application implements CommandLineRunner {

    @Autowired
    TodoRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(Listingtodosh2Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        repo.save(new Todo("I have to learn Object Relational Mapping"));
        repo.save(new Todo("I have to learn Java Spring"));
        repo.save(new Todo("I have to learn Java Design Patterns"));
    }
}



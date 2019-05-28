package com.greenfox.standak2.connectionwithmysql;


import com.greenfox.standak2.connectionwithmysql.models.Todo;
import com.greenfox.standak2.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionWithMysqlApplication implements CommandLineRunner {

    @Autowired
    TodoRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(ConnectionWithMysqlApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
//        repo.save(new Todo("I have to learn Object Relational Mapping", true, false));
//        repo.save(new Todo("I have to learn Java Spring"));
//        repo.save(new Todo("I have to learn Java Design Patterns", true, true));
//        repo.findById(1l).get().setDone(true);
//        repo.findById(2l).get().setUrgent(true);
//        repo.saveAll(repo.findAll());

    }
}

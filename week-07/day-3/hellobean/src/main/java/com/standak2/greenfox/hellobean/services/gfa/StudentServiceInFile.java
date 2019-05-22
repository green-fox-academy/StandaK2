package com.standak2.greenfox.hellobean.services.gfa;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("file")
public class StudentServiceInFile implements StudentServiceInterface {
    private List<String> names;
    private String fileName = "studentlist.txt";
    private Path path;


    public StudentServiceInFile() {
        this.path = Paths.get(this.fileName);
        this.names = new ArrayList<>();
        this.loadFromFile();
    }

    public List<String> findAll() {
        this.loadFromFile();
        return names;
    }

    public void save(String student) {
        names.add(student);
        this.saveToFile();
    }

    public void saveToFile() {
        try {
            Files.write(this.path, this.names);
        } catch (IOException error) {
            System.out.println("Can't write to the file");
        }
    }

    private void loadFromFile() {
        try {
            this.names = Files.readAllLines(this.path);
        } catch (IOException error) {
            System.out.println("Not able to read file.");
        }
    }

    public int count() {
        return names.size();
    }

    public boolean checkStudent(String name) {
        return names.contains(name);
    }
}

package com.standak2.greenfox.hellobean.services.gfa;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("list")
public class StudentServiceList implements StudentServiceInterface {
    ArrayList<String> names;

    public StudentServiceList() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    public List<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
    }

    public int count() {
        return names.size();
    }

    public boolean checkStudent(String name){
        return names.contains(name);
        }
}

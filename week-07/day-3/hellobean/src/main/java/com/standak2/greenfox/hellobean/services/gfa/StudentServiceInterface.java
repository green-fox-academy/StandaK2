package com.standak2.greenfox.hellobean.services.gfa;

import java.util.List;

public interface StudentServiceInterface {

    List<String> findAll();

    void save(String student);

    int count();

    boolean checkStudent(String name);

}

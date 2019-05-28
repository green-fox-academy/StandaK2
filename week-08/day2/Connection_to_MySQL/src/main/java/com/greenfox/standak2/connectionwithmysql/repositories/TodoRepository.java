package com.greenfox.standak2.connectionwithmysql.repositories;

import com.greenfox.standak2.connectionwithmysql.models.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

    List<Todo> findAllByDone(boolean done);

}

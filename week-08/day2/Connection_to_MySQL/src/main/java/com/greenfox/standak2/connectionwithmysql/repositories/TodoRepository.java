package com.greenfox.standak2.connectionwithmysql.repositories;

import com.greenfox.standak2.connectionwithmysql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

    List<Todo> findAllByDone(boolean done);

}

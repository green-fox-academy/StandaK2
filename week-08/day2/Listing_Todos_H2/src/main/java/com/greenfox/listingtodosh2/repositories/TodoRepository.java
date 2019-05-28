package com.greenfox.listingtodosh2.repositories;

import com.greenfox.listingtodosh2.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}

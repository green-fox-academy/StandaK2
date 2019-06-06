package com.greenfox.standak2.reddit.repository;

import com.greenfox.standak2.reddit.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, String> {
}
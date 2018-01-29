package com.cps.repository;

import org.springframework.data.repository.CrudRepository;

import com.cps.domain.User;

public interface UserRepo extends CrudRepository<User, String> {

}

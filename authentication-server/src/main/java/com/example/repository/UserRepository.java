package com.example.repository;

import com.example.repository.entity.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> getByUsername(String username);
}

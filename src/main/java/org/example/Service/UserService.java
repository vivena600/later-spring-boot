package org.example.Service;

import org.example.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User save(User user);
}

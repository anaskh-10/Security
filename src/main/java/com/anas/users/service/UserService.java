package com.anas.users.service;

import com.anas.users.entites.Role;
import com.anas.users.entites.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
    List<User> findAllUsers();
}

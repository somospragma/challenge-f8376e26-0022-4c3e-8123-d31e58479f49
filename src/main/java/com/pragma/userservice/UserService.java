package com.pragma.userservice;

public class UserService {
    public String createUser(String name, String email) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        // Simulate user creation
        return "User created: " + name + " (" + email + ")";
    }

    public String updateUser(String name, String email) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        // Simulate user update
        return "User updated: " + name + " (" + email + ")";
    }

    public String deleteUser(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        // Simulate user deletion
        return "User deleted: " + name;
    }
}
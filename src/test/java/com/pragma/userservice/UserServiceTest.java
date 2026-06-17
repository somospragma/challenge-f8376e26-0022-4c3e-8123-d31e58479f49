package com.pragma.userservice;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class UserServiceTest {

    @Test
    public void testCreateUser() {
        UserService service = new UserService();
        String result = service.createUser("John Doe", "john.doe@example.com");
        assertEquals("User created: John Doe (john.doe@example.com)", result);
    }

    @Test
    public void testUpdateUser() {
        UserService service = new UserService();
        String result = service.updateUser("Jane Doe", "jane.doe@example.com");
        assertEquals("User updated: Jane Doe (jane.doe@example.com)", result);
    }

    @Test
    public void testDeleteUser() {
        UserService service = new UserService();
        String result = service.deleteUser("John Doe");
        assertEquals("User deleted: John Doe", result);
    }
}
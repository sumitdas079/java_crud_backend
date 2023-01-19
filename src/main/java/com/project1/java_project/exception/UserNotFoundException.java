package com.project1.java_project.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id)
    {
        super("User cannot be found with id: "+id);
    }
}

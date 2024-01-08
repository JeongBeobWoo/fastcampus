package org.example;

public class CorrectFixedPasswordGenerator implements PasswordGenerator{

    public String generatePassword() {
        return "aabbccdd"; // 8 char
    }
}

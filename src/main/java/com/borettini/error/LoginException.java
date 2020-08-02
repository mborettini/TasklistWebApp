package com.borettini.error;

public class LoginException extends RuntimeException {
    public LoginException(String message) {
        super(message);
    }
}

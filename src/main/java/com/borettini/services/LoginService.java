package com.borettini.services;

import com.borettini.UserHolder;
import com.borettini.error.LoginException;
import com.borettini.model.User;


public class LoginService {
    private static LoginService instance;

    private LoginService() {
    }

    public static LoginService getInstance() {
        if (instance == null) {
            synchronized (LoginService.class) {
                if (instance == null) {
                    instance = new LoginService();
                }
            }
        }
        return instance;
    }

    public String login(String username, String password) {
        User user = UserHolder.getUserByUsername(username);
        if (user.getPassword().equals(password)) {
            return user.getUsername();
        }
        throw new LoginException("Wrong login or password.");
    }
}

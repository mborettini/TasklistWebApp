package com.borettini.services;

import com.borettini.error.RegistrationException;
import com.borettini.model.User;
import com.borettini.UserHolder;

//Second approach: class could be Singleton
public class RegisterService {

    public static void register(String username, String password, String repeatPassword) {
        if (validateUsername(username) && validatePassword(password, repeatPassword)) {
            User user = new User(username, password);
            UserHolder.add(user);
        } else {
            throw new RegistrationException("");
        }
    }

    private static boolean validatePassword(String password, String repeatPassword) {
        if (password != null && password.isEmpty() == false &&
                repeatPassword != null && repeatPassword.isEmpty() == false &&
                password.equals(repeatPassword)) {
            return true;
        } else {
            throw new RegistrationException("Password and repeated password are different or empty!");
        }
    }

    private static boolean validateUsername(String username) {
        //FIXME validate user already exists, method findByUsername
        if (username != null && username.isEmpty() == false) {
            return true;
        } else {
            throw new RegistrationException("Username can not be empty!");
        }
    }
}

package com.borettini;

import com.borettini.error.LoginException;
import com.borettini.model.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserHolder {
    private static List<User> users = new ArrayList<>();

    public static void add(User user) {
        users.add(user);
    }

    public static boolean findByUsername(String username) {
        for (Iterator<User> it = users.iterator(); it.hasNext(); ) {
            if (it.next().getUsername().equals(username)) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public static User getUserByUsername(final String username){
        return users.stream().filter(u -> u.getUsername().equals(username))
                .findFirst()
                .orElseThrow(() -> new LoginException("Wrong username or password."));
    }

}
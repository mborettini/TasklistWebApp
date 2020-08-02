package com.borettini;

import com.borettini.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserHolder {
    private static List<User> users = new ArrayList<>();

    public static void add(User user){
        users.add(user);
    }
}

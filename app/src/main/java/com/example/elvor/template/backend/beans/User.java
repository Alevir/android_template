package com.example.elvor.template.backend.beans;

import java.util.List;

public class User {
    enum Role {
        ADMIN,
        USER
    }

    String name;
    Role role;
    int level;
    List<String> skills;
}

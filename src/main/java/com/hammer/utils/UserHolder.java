package com.hammer.utils;

import com.hammer.entity.User;


public class UserHolder {
    private static User user;

    public UserHolder(User user) {
        this.user = user;
    }

    public UserHolder() {
        this.user = null;
    }

    // Getter 和 Setter
    public static User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
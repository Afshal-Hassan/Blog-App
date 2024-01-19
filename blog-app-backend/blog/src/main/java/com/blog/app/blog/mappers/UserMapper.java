package com.blog.app.blog.mappers;

import com.blog.app.blog.entities.User;
import com.blog.app.blog.payloads.UserData;

public final class UserMapper {
    
    public static UserData mapToData(User user) {
        UserData userData = new UserData();

        userData.setId(user.getId());
        userData.setEmail(user.getEmail());
        userData.setPassword(user.getPassword());
        userData.setUsername(user.getUsername());

        return userData;
    }


    public static User mapToEntity(UserData userData) {
        User user = new User();

        user.setEmail(userData.getEmail());
        user.setPassword(userData.getPassword());
        user.setUsername(userData.getUsername());

        return user;
    }
}

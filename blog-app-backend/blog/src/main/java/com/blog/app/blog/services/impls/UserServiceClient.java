package com.blog.app.blog.services.impls;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.app.blog.entities.User;
import com.blog.app.blog.exceptions.NotFoundException;
import com.blog.app.blog.repos.UserRepo;
import com.blog.app.blog.services.interfaces.UserService;


@Service
public class UserServiceClient implements UserService {


    @Autowired
    private UserRepo repo;
    

    @Override
    public User getUserById(Long userId) {
        Optional<User> user = repo.findById(userId);
        if(user.isPresent()) {
            return user.get();
        } else {
            throw new NotFoundException("User not found by id: " + userId);
        }
    }
}

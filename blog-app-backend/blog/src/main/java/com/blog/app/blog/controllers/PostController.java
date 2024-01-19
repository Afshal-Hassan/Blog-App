package com.blog.app.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.app.blog.payloads.GenericResponse;
import com.blog.app.blog.payloads.PostData;
import com.blog.app.blog.services.interfaces.PostService;


@CrossOrigin
@RestController
@RequestMapping("/api/post")
public class PostController {

    @Autowired
    private PostService service;


    @GetMapping("/all")
    public GenericResponse getAllPosts() {
        List<PostData> posts = service.getAllPosts();
        return new GenericResponse("List of all posts", posts);
    }
    

    @PostMapping("/save")
    public GenericResponse createPost(@RequestBody PostData postData) {
        PostData post = service.createPost(postData);
        return new GenericResponse("Post has been saved successfully", post);
    }
}

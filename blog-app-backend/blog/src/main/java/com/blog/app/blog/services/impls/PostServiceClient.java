package com.blog.app.blog.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.app.blog.entities.Post;
import com.blog.app.blog.entities.User;
import com.blog.app.blog.mappers.PostMapper;
import com.blog.app.blog.payloads.PostData;
import com.blog.app.blog.repos.PostRepo;
import com.blog.app.blog.services.interfaces.PostService;
import com.blog.app.blog.services.interfaces.UserService;

@Service
public class PostServiceClient implements PostService {
    
    @Autowired
    private PostRepo repo;

    @Autowired
    private UserService userService;


    @Override
    public List<PostData> getAllPosts() {
        List<Post> posts = repo.findAll();

        return posts.stream()
            .map(post -> PostMapper.mapToData(post)).toList();
    }


    @Override
    public PostData createPost(PostData postData) {
        Post post = PostMapper.mapToEntity(postData);

        post.getTags()
            .stream()
            .forEach(tag -> tag.setPost(post));

        User user = userService.getUserById(postData.getUserId());
        post.setUser(user);

        Post savedPost = repo.save(post);
        return PostMapper.mapToData(savedPost);
    } 
    
}

package com.blog.app.blog.services.interfaces;

import java.util.List;

import com.blog.app.blog.payloads.PostData;


public interface PostService {

    List<PostData> getAllPosts();

    PostData createPost(PostData postData);
    
}

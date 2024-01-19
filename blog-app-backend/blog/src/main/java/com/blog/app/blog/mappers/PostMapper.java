package com.blog.app.blog.mappers;

import com.blog.app.blog.entities.Post;
import com.blog.app.blog.payloads.PostData;
import com.blog.app.blog.utils.UtcDateTimeUtils;


public final class PostMapper {

    public static PostData mapToData(Post post) {
        PostData postData = new PostData();

        postData.setId(post.getId());
        postData.setTitle(post.getTitle());
        postData.setText(post.getText());
        postData.setDescription(post.getDescription());
        postData.setUploadedAt(post.getUploadedAt().toString());
        postData.setTags(
            post.getTags()
                .stream()
                .map(tag -> TagMapper.mapToData(tag))
                .toList()
        );
        postData.setUserId(UserMapper.mapToData(post.getUser()).getId());
        
        return postData;
    } 

    public static Post mapToEntity(PostData postData) {
        Post post = new Post();

        post.setTitle(postData.getTitle());
        post.setText(postData.getText());
        post.setDescription(postData.getDescription());
        post.setUploadedAt(UtcDateTimeUtils.utcTimeNow());
        post.setTags(
            postData.getTags()
                    .stream()
                    .map(tag -> TagMapper.mapToEntity(tag))
                    .toList()
        );
        
        return post;
    } 
}

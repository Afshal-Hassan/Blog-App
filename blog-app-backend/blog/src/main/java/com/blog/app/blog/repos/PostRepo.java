package com.blog.app.blog.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.app.blog.entities.Post;


@Repository
public interface PostRepo extends JpaRepository<Post,Long> {  
}

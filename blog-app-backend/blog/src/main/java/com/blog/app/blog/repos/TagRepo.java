package com.blog.app.blog.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.app.blog.entities.Tag;



@Repository
public interface TagRepo extends JpaRepository<Tag,Long> {
}

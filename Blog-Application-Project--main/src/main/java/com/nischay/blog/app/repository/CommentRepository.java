package com.nischay.blog.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nischay.blog.app.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer>{

}

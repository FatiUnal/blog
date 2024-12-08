package com.example.blogv1.repository;

import com.example.blogv1.entity.post.EstateType;
import com.example.blogv1.entity.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Integer> {
    List<Post> findAllByStatus(String status);
    List<Post> findAllByPostDetails_Estate(EstateType estate);
    Optional<Post> findByPostDetails_IlanNo(String postDetailsİlanNo);
}

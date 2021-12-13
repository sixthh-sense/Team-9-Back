package com.sparta.team9back.repository;

import com.sparta.team9back.model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface PostRepository extends JpaRepository <Post, Long>{
    List<Post> findAllByOrderByIdDesc();
    Page<Post> findAllByOrderByIdDesc(Pageable pageable);
}

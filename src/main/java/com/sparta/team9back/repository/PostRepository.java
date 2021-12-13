package com.sparta.team9back.repository;

import com.sparta.team9back.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository <Post, Long>{

}

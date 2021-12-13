package com.sparta.team9back.service;

import com.sparta.team9back.dto.HomeResponseDto;
import com.sparta.team9back.model.Post;
import com.sparta.team9back.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HomeService {

    private final PostRepository postRepository;

    public List<HomeResponseDto> findAllPosts(Pageable pageable) {
        List<Post> posts = postRepository.findAllByOrderByIdDesc(pageable).getContent();
        List<HomeResponseDto> allPosts = new ArrayList<>();
        for (Post post : posts) {
            HomeResponseDto responseDto = createPostDto(post);
            allPosts.add(responseDto);
        }
        return allPosts;
    }

    private HomeResponseDto createPostDto(Post post) {
        return new HomeResponseDto(
                post.getUser().getUsername(),
                post.getTitle(),
                post.getPrice(),
                post.getGoodsImg(),
                post.getLike()
        );
    }
}

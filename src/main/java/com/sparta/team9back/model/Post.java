package com.sparta.team9back.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private User user;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "LONGTEXT")
    private String content;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private String goodsImg;

    @Column(nullable = false)
    private Boolean negoCheck;
}

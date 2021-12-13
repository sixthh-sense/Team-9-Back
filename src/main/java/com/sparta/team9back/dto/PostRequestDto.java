package com.sparta.team9back.dto;

import com.sparta.team9back.model.Category;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PostRequestDto {
    private String title;
    private String content;
    private int price;
    private String goodsImg;
    private Boolean negoCheck;
    private String category;
}

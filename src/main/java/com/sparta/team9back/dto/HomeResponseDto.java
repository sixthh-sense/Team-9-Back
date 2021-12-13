package com.sparta.team9back.dto;

import lombok.*;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@Builder
public class HomeResponseDto {
    String username;
    String title;
    int price;
    String goodsImg;
    boolean like;
}

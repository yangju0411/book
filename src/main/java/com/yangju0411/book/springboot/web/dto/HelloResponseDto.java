package com.yangju0411.book.springboot.web.dto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor

public class HelloResponseDto {
    private final String name;
    private final int amount;
}

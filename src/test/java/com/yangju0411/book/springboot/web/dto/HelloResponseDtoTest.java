package com.yangju0411.book.springboot.web.dto;
import org.junit.jupiter.api.Test; // 변경


import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {
    @Test

    public void test_lombok() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount); // RequiredArgsConstructor로 선언하지 않은 final 필드를 인자로 받는 생성자가 이미 선언됨

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }

}

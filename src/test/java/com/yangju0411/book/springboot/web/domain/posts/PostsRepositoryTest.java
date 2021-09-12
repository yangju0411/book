package com.yangju0411.book.springboot.web.domain.posts;

import com.yangju0411.book.springboot.domain.posts.Posts;
import com.yangju0411.book.springboot.domain.posts.PostsRepository;

import org.junit.jupiter.api.AfterEach; // 변경
import org.junit.jupiter.api.Test; // 변경
import org.junit.jupiter.api.extension.ExtendWith; // 변경
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension; // 변경

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class PostsRepositoryTest {
    @Autowired
    PostsRepository postsRepository;

    @AfterEach
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Test
    public void load_and_save_post() {
        //given
        String title = "테스트 게시글";
        String content = "테스트 본문";

        postsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("yangju0411@gmail.com")
                .build());

        // when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo((title));
        assertThat(posts.getContent()).isEqualTo(content);
    }
}

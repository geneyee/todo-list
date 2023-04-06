package com.toy.todolist.domain.todo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@SpringBootTest
public class TodolistRepositoryTest {

    @Autowired
    private TodolistRepository todolistRepository;

    @Test
    void todoSave() {
        String content = "할일 1";
        Boolean isCompleted = false;

        todolistRepository.save(Todolist.builder()
                .content(content)
                .isCompleted(isCompleted)
                .build());

        List<Todolist> todolistList = todolistRepository.findAll();

        Todolist todolist = todolistList.get(0);
        assertThat(todolist.getContent()).isEqualTo(content);
        assertThat(todolist.getIsCompleted()).isEqualTo(isCompleted);




    }

}

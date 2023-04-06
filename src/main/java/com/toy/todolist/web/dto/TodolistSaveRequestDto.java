package com.toy.todolist.web.dto;

import com.toy.todolist.domain.todo.Todolist;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TodolistSaveRequestDto {

    private String content;
    private Boolean isCompleted;

    @Builder
    public TodolistSaveRequestDto(String content, Boolean isCompleted) {
        this.content = content;
        this.isCompleted = isCompleted;
    }

    public Todolist toEntity() {
        return Todolist.builder()
                .content(content)
                .isCompleted(isCompleted)
                .build();
    }

}

package com.toy.todolist.web.dto;

import com.toy.todolist.domain.todo.Todolist;
import lombok.Getter;

@Getter
public class TodolistListResponseDto {

    private Long id;
    private String content;
    private Boolean isCompleted;

    public TodolistListResponseDto(Todolist entity) {
        this.id = entity.getId();
        this.content = entity.getContent();
        this.isCompleted = entity.getIsCompleted();

    }


}

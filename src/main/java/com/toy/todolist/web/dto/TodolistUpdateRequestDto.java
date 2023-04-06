package com.toy.todolist.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TodolistUpdateRequestDto {

    private String content;
    private Boolean isCompleted;

    @Builder
    public TodolistUpdateRequestDto(String content, Boolean isCompleted) {
        this.content = content;
        this.isCompleted = isCompleted;
    }


}

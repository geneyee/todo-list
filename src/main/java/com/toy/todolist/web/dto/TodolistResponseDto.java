package com.toy.todolist.web.dto;

import com.toy.todolist.domain.todo.Todolist;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class TodolistResponseDto {

    private Long id;
    private String content;
    private Boolean isCompleted;

    //dto class 생성자 entity 파라미터로 사용(db 조회시)
    public TodolistResponseDto(Todolist entity) {
        this.id = entity.getId();
        this.content = entity.getContent();
        this.isCompleted = entity.getIsCompleted();
    }


}

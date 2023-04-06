package com.toy.todolist.domain.todo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Todolist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String content;

    @Column(nullable = false)
    private Boolean isCompleted;

    @Builder
    public Todolist(String content, Boolean isCompleted) {
        this.content = content;
        this.isCompleted = isCompleted;
    }
}

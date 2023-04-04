package com.toy.todolist;


import com.toy.todolist.domain.todo.Todolist;
import com.toy.todolist.domain.todo.TodolistRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TodoListApplicationTests {

	@Autowired
	TodolistRepository todolistRepository;

	@Test
	void testJpa() {
		Todolist todolist1 = new Todolist();
		todolist1.setContent("할일1");
		todolist1.setIsCompleted(Boolean.TRUE);
		this.todolistRepository.save(todolist1);
	}
}

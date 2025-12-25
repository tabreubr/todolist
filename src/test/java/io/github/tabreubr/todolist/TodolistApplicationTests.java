package io.github.tabreubr.todolist;

import io.github.tabreubr.todolist.entities.Todo;
import io.github.tabreubr.todolist.enums.Priority;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TodolistApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testCreateTodoSuccess() {
		var todo = Todo.builder()
				.name("todo 1")
				.description("desc todo 1")
				.realized(true)
				.priority(Priority.ALTA)
				.build();

		webTestClient
				.post()
				.uri("/todos")
				.bodyValue(todo)
				.exchange()
				.expectStatus().isOk()
				.expectBody()
				.jsonPath("$").isArray()
				.jsonPath("$.length()").isEqualTo(1)
				.jsonPath("$[0].name").isEqualTo("todo 1")
				.jsonPath("$[0].description").isEqualTo("desc todo 1")
				.jsonPath("$[0].realized").isEqualTo(true)
				.jsonPath("$[0].priority").isEqualTo("ALTA");
	}

	@Test
	void testCreateTodoFailure() {
		webTestClient
				.post()
				.uri("/todos")
				.bodyValue(
						new Todo("", "", false, Priority.ALTA))
				.exchange()
				.expectStatus()
				.isBadRequest();
	}

}

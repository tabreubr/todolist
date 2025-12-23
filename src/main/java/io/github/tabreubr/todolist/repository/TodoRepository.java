package io.github.tabreubr.todolist.repository;

import io.github.tabreubr.todolist.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}

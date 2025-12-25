package io.github.tabreubr.todolist.entities;

import io.github.tabreubr.todolist.enums.Priority;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "todo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Todo {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 255, nullable = false)
    @NotBlank
    private String name;

    @Column(length = 500, nullable = false)
    @NotBlank
    private String description;

    @Column(nullable = false)
    @Builder.Default
    private Boolean realized = false;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Builder.Default
    private Priority priority = Priority.MEDIA;

    public Todo(String name, String description, boolean realized, Priority priority) {
        this.name = name;
        this.description = description;
        this.realized = realized;
        this.priority = priority != null ? priority : Priority.MEDIA;
    }
}

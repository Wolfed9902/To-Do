package com.wolfed9902.todo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class ToDoItem {

    // Var

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String title;

    private boolean completed = false;


}

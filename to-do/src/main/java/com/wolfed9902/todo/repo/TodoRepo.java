package com.wolfed9902.todo.repo;

import com.wolfed9902.todo.model.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TodoRepo extends JpaRepository<ToDoItem, Long> {
}

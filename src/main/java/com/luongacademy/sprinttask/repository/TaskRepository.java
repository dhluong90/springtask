package com.luongacademy.sprinttask.repository;

import com.luongacademy.sprinttask.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {

}

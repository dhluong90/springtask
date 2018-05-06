package com.luongacademy.sprinttask.controller;

import com.luongacademy.sprinttask.domain.Task;
import com.luongacademy.sprinttask.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;

public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = "/")
    public Iterable<Task> getList() {
        return taskService.getAll();
    }
}

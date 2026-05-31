package com.taskmanager.taskmanager.controller;

import com.taskmanager.taskmanager.entity.Task;
import com.taskmanager.taskmanager.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")

public class TaskController {

    @Autowired
    private TaskService service;

    @PostMapping
    public Task addTask(@RequestBody Task task) {
        return service.addTask(task);
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return service.getAllTasks();
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id,
                           @RequestBody Task task) {

        return service.updateTask(id, task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {

        service.deleteTask(id);
    }
    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return service.getTaskById(id);
    }
}
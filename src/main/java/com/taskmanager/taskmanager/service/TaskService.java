package com.taskmanager.taskmanager.service;

import com.taskmanager.taskmanager.entity.Task;
import com.taskmanager.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TaskService {

    @Autowired
    private TaskRepository repository;

    public Task addTask(Task task) {
        return repository.save(task);
    }

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task updateTask(Long id, Task updatedTask) {

        Task task = repository.findById(id).orElseThrow();

        task.setTitle(updatedTask.getTitle());
        task.setDescription(updatedTask.getDescription());
        task.setCompleted(updatedTask.isCompleted());

        return repository.save(task);
    }

    public void deleteTask(Long id) {
        repository.deleteById(id);
    }
    public Task getTaskById(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
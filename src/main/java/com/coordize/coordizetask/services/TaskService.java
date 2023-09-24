package com.coordize.coordizetask.services;

import com.coordize.coordizetask.models.Task;
import com.coordize.coordizetask.repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public Task saveTask(Task task) {
        return this.repository.save(task);
    }

    public void deleteTask(Task task) {
        this.repository.delete(task);
    }

    public Optional<Task> getTaskById(long id) {
        return this.repository.findById(id);
    }

    public Optional<ArrayList<Task>> getAllTasksByAssigner(long assignerId) {
        return this.repository.findAllByAssignerId(assignerId);
    }

    public Optional<ArrayList<Task>> getAllTasksByAssignee(long assigneeId) {
        return this.repository.findAllByAssigneeId(assigneeId);
    }

    public Optional<ArrayList<Task>> getAllTasksByTitle(String title) {
        return this.repository.findAllByTitle(title);
    }

    public Optional<Task> findParentUsingSubTask(Task subTask) {
        return this.repository.findBySubTasks(subTask);
    }

}

package com.coordize.coordizetask.services;

import com.coordize.coordizetask.models.Task;
import com.coordize.coordizetask.repositories.TaskRepository;
import com.coordize.coordizeuser.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task saveTask(Task task) {
        return this.taskRepository.save(task);
    }

    public void deleteTask(Task task) {
        this.taskRepository.delete(task);
    }

    public Optional<Task> getTaskById(long id) {
        return this.taskRepository.findById(id);
    }

    public Optional<ArrayList<Task>> getAllTasksUsingAssigner(User user) {
        return this.taskRepository.findAllUsingAssigner(user);
    }

    public Optional<ArrayList<Task>> getAllTasksUsingAssignee(User user) {
        return this.taskRepository.findAllUsingAssignee(user);
    }

    public Optional<ArrayList<Task>> getAllTasksUsingTitle(String title) {
        return this.taskRepository.findAllUsingTitle(title);
    }

    public Optional<Task> findParentUsingSubTask(Task subTask) {
        return this.taskRepository.findUsingSubTask(subTask);
    }

}

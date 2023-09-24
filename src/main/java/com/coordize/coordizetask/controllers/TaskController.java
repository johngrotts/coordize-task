package com.coordize.coordizetask.controllers;

import com.coordize.coordizetask.models.Task;
import com.coordize.coordizetask.services.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@RequestMapping("task")
@RestController
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public Task getTask(@PathVariable long id) {
        return this.service.getTaskById(id).orElse(null);
    }

    @GetMapping(path = "/search", produces = "application/json")
    public ArrayList<Task> getTasks(Map<String, String> params) {
        if(params.isEmpty()) {
            return new ArrayList<>();
        }
        if(params.containsKey("assignerId")) {
            long userId = Long.parseLong(params.get("assignerId"));
            return this.service.getAllTasksByAssigner(userId).orElse(null);
        }
        if(params.containsKey("assigneeId")) {
            long userId = Long.parseLong(params.get("assigneeId"));
            return this.service.getAllTasksByAssignee(userId).orElse(null);
        }
        return new ArrayList<>();
    }


}

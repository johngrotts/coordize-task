package com.coordize.coordizetask.controllers;

import com.coordize.coordizetask.models.Task;
import com.coordize.coordizetask.services.TaskService;
import com.coordize.coordizeuser.models.User;
import com.coordize.coordizeuser.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RequestMapping("task")
@RestController
public class TaskController {

    private TaskService service;
    private UserService userService;

    @GetMapping(path = "/{id}", produces = "application/json")
    public Task getTask(@PathVariable long id) {
        return this.service.getTaskById(id).orElse(null);
    }

    @GetMapping(path = "/search", produces = "application/json")
    public ArrayList<Task> getTasks(@RequestParam(required = false) long assignerId) {
        User assigner = this.userService.findByUserId(assignerId).orElse(null);
        return this.service.getAllTasksUsingAssigner(assigner).orElse(null);
    }
}

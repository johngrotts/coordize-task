package com.coordize.coordizetask.models;

import com.coordize.coordizeuser.models.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * A Task for a User to complete
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Task extends BaseDate {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String description;
    private LocalDate completeDate;
    @OneToOne
    private User assigner;
    @OneToOne
    private User assignee;
    /**
     * Allows for tasks to be subtasks of one another.
     * Sublevel is an int where 0 is top level, 1 is the first sub-level and so on
     */
    @OneToMany
    private ArrayList<Task> subTasks;
    private int subLevel;

}

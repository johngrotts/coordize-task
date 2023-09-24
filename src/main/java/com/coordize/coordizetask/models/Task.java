package com.coordize.coordizetask.models;

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
    private long assignerId;
    private long assigneeId;
    /**
     * Allows for tasks to be subtasks of one another.
     * Sublevel is an int where 0 is top level, 1 is the first sub-level and so on
     */
    @OneToMany
    private ArrayList<Task> subTasks;
    private int subLevel;

}

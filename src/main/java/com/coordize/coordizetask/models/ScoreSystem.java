package com.coordize.coordizetask.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

/**
 * Sets parameters for a Task
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class ScoreSystem extends BaseDate {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    private int minimum;
    private int maximum;
    @OneToMany
    private Set<Task> tasks;
    private long creatorId;

}

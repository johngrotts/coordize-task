package com.coordize.coordizetask.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

/**
 * Assigns a Score to a Task based on the ScoreSystem parameters
 */
@Data
@Entity
public class TaskScore {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne
    private Task task;
    private long score;
    private LocalDate completionDate;
    @OneToOne
    private ScoreSystem scoreSystem;

}

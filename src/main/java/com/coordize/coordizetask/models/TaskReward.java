package com.coordize.coordizetask.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

/**
 * Assigns a Reward to a User via a completed Task
 */
@Data
@Entity
public class TaskReward {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne
    private Task task;
    @OneToOne
    private Reward reward;
    private LocalDate assignDate;
    private LocalDate completeDate;
    private long assignerId;
    private long assigneeId;

}

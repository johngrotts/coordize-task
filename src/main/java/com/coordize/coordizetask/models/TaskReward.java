package com.coordize.coordizetask.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TaskReward {

    private long id;
    private long taskId;
    private long rewardId;
    private long assignerId;
    private long assigneeId;
    private LocalDate assignDate;
    private LocalDate completeDate;

}

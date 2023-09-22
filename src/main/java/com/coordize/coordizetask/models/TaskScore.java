package com.coordize.coordizetask.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TaskScore {

    private long id;
    private long taskId;
    private long score;
    private long approverId;
    private long assigneeId;
    private LocalDate completionDate;

}

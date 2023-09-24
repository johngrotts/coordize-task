package com.coordize.coordizetask.models;

import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.Map;

@Data
public class TaskOrder {

    private long id;
    private String taskGroup;
    private long createdById;
    @OneToOne
    private Map<Long, Task> taskOrder;

}

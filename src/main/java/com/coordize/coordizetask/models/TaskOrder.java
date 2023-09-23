package com.coordize.coordizetask.models;

import com.coordize.coordizeuser.models.User;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.Map;

@Data
public class TaskOrder {

    private long id;
    private String taskGroup;
    @OneToOne
    private User createdBy;
    @OneToOne
    private Map<Long, Task> taskOrder;

}

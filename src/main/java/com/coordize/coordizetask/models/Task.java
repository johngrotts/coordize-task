package com.coordize.coordizetask.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
public class Task extends BaseDate {

    private long id;
    private String title;
    private String description;
    private LocalDate completeDate;
}

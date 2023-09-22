package com.coordize.coordizetask.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Reward extends BaseDate {

    private long id;
    private String title;
    private String description;

}

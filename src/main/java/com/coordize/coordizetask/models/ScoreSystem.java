package com.coordize.coordizetask.models;

import lombok.Data;

@Data
public class ScoreSystem {

    private long id;
    private String name;
    private String description;
    private int minimum;
    private int maximum;
    private long creatorId;

}

package com.coordize.coordizetask.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Reward for Tasks (assigned by TaskReward)
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Reward extends BaseDate {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String description;

}

package com.coordize.coordizetask.models;

import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDate;

@Data
public abstract class BaseDate {

    private LocalDate createDate;
    private LocalDate lastUpdate;

}

package com.coordize.coordizetask.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BaseDate {

    private LocalDate createDate;
    private LocalDate lastUpdate;

}

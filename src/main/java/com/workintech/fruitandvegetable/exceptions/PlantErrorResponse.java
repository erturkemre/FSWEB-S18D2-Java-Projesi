package com.workintech.fruitandvegetable.exceptions;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

@ToString
@AllArgsConstructor
public class PlantErrorResponse {
    private Integer status;
    private String message;
    private LocalDateTime dateTime;
}

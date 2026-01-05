package com.app.logworkout.log.dto;

import jakarta.validation.constraints.NotBlank;

public class RoutineCreateDTO {

    @NotBlank
    private String name;


    public RoutineCreateDTO() {
    }

    public RoutineCreateDTO(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.app.logworkout.log.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ExerciseCreateDTO {
    @NotBlank
    private String name;

    @NotNull
    private Double weight;

    @NotNull
    private Integer reps;

    public ExerciseCreateDTO(String name, double weight, int reps) {
        this.name = name;
        this.weight = weight;
        this.reps = reps;
    }

    public ExerciseCreateDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Integer getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

}

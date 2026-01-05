package com.app.logworkout.log.dto;

public class ExerciseUpdateDTO {
    private Double weight;
    private Integer reps;

    public ExerciseUpdateDTO() {
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setReps(Integer reps) {
        this.reps = reps;
    }

    public Double getWeight() {
        return weight;
    }

    public Integer getReps() {
        return reps;
    }
}

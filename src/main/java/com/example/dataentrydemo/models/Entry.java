package com.example.dataentrydemo.models;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

public class Entry {

    @Getter
    @Setter
    @NotBlank(message = "Name is required")
    private String name;

    @Getter
    @Setter
    private Integer age;

    @Getter
    @Setter
    @NotBlank(message = "Title is required")
    private String title;

    @Getter
    @Setter
    private String hometown;

}

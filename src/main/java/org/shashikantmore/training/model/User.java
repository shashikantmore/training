package org.shashikantmore.training.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class User {

    private String name;

    private LocalDate birthDate;
}

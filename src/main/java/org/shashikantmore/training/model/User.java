package org.shashikantmore.training.model;

import lombok.Data;

import java.time.LocalDate;

/**
 * User model class.
 */
@Data
public class User {

    /**
     * name for user.
     */
    private String name;

    /**
     * Birth date for user.
     */
    private LocalDate birthDate;
}

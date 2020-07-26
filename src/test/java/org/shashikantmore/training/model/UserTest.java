package org.shashikantmore.training.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    @DisplayName("User constructor")
    void testConstructor() {
        final User user = new User();
        Assertions.assertNotNull(user);
    }

    @Test
    @DisplayName("Equals test")
    void testEquals() {
        User firstUser = new User();
        firstUser.setName("Sachin Patil");
        User secondUser = new User();
        secondUser.setName("Sachin Patil");
        Assertions.assertEquals(secondUser, firstUser);
    }
}

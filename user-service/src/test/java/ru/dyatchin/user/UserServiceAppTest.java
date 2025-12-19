package ru.dyatchin.user;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
public class UserServiceAppTest {

    @Test
    void contextLoad() {

    }

    @Test
    void mainMethodShouldStart() {
        assertDoesNotThrow(() -> UserServiceApp.main(new String[]{}));
    }
}

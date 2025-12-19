package ru.dyatchin.auth;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
public class AuthServiceAppTest {

    @Test
    void contextLoads(){

    }

    @Test
    void mainMethodShouldStart() {
        assertDoesNotThrow(() -> AuthServiceApp.main(new String[]{}));
    }
}

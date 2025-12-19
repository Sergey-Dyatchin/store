package ru.dyatchin.notification;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
public class NotificationServiceAppTest {

    @Test
    void contextLoad(){

    }

    @Test
    void mainMethodShouldStart() {
        assertDoesNotThrow(() -> NotificationServiceApp.main(new String[]{}));
    }
}

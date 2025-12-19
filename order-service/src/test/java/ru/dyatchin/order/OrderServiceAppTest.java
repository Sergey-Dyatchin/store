package ru.dyatchin.order;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
public class OrderServiceAppTest {

    @Test
    void contextLoad() {

    }

    @Test
    void mainMethodShouldStart() {
        assertDoesNotThrow(() -> OrderServiceApp.main(new String[]{}));
    }
}

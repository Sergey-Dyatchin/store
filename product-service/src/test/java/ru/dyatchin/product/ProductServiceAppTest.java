package ru.dyatchin.product;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
public class ProductServiceAppTest {

    @Test
    void contextLoad() {

    }

    @Test
    void mainMethodShouldStart() {
        assertDoesNotThrow(() -> ProductServiceApp.main(new String[]{}));
    }
}

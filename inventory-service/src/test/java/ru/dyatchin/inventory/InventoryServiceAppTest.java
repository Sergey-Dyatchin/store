package ru.dyatchin.inventory;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
public class InventoryServiceAppTest {

    @Test
    void  contextLoad(){

    }

    @Test
    void mainMethodShouldStart() {
        assertDoesNotThrow(() -> InventoryServiceApp.main(new String[]{}));
    }
}

package ru.dyatchin.gateway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
public class ApiGatewayAppTest {

    @Test
    void contextLoads() {

    }

    @Test
    void mainMethodShouldStart() {
        assertDoesNotThrow(() -> ApiGatewayApp.main(new String[]{}));
    }
}

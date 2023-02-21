package io.ontollogix.sbcicdgh.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyRestControllerTest {
    @Autowired
    MyRestController myRestController;


    @Test
    void health() {
        assertEquals( "HEALTH CHECK OK!", myRestController.healthCheck());
    }

    @Test
    void version() {
        assertEquals( "The actual version is 1.0.0", myRestController.version());
    }

    @Test
    void nationsLength() {
        Integer nationsLength = myRestController.getRandomNations().size();
        assertEquals(10, nationsLength);
    }

    @Test
    void currenciesLength() {
        Integer currenciesLength = myRestController.getRandomCurrencies().size();
        assertEquals(20, currenciesLength);
    }


}
package net.jazbelt.spring3simplerest.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FakeServiceConfigTest {

    @Autowired
    private FakeServiceConfig config;

    @Test
    void getUrl() {
        assertEquals("http://foo.bar", config.getUrl());
    }

    @Test
    void getUser() {
        assertEquals("jdoe", config.getUser());
    }

    @Test
    void getPass() {
        assertEquals("1234", config.getPass());
    }
}
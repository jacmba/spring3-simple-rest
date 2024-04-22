package net.jazbelt.spring3simplerest.controller;

import net.jazbelt.spring3simplerest.model.FakeServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class FakeServiceController {

    private final FakeServiceConfig service;

    @Autowired
    public FakeServiceController(FakeServiceConfig service) {
        this.service = service;
    }


    @GetMapping
    public FakeServiceConfig getConfig() {
        return service;
    }
}

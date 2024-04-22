package net.jazbelt.spring3simplerest.controller;

import net.jazbelt.spring3simplerest.domain.IPersonService;
import net.jazbelt.spring3simplerest.model.IPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SimpleRestController {

    private final IPersonService personService;

    @Autowired
    public SimpleRestController(IPersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello world!";
    }

    @GetMapping("/person")
    public List<IPerson> getPersons() {
        return personService.getPersons();
    }
}

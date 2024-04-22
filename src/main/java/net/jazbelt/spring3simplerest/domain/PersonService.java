package net.jazbelt.spring3simplerest.domain;

import net.jazbelt.spring3simplerest.model.IPerson;
import net.jazbelt.spring3simplerest.model.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Qualifier("PersonService")
public class PersonService implements IPersonService {
    @Override
    public List<IPerson> getPersons() {
        return Arrays.asList(
                new Person("John Doe", 20),
                new Person("Jack Doe", 30),
                new Person("Jane Doe", 25)
        );
    }
}

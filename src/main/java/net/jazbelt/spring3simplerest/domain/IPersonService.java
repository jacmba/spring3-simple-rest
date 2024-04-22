package net.jazbelt.spring3simplerest.domain;

import net.jazbelt.spring3simplerest.model.IPerson;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPersonService {
    List<IPerson> getPersons();
}

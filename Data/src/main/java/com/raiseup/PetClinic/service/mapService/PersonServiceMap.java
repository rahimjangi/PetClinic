package com.raiseup.PetClinic.service.mapService;

import com.raiseup.PetClinic.model.Person;
import com.raiseup.PetClinic.service.CrudService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","map"})
public class PersonServiceMap extends AbstractMapService<Person,Long> implements CrudService<Person,Long> {
    @Override
    public Set<Person> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Person person) {
        super.delete(person);
    }

    @Override
    public Person save(Person person) {
        return super.save(person);
    }

    @Override
    public Person findById(Long id) {
        return super.findById(id);
    }
}

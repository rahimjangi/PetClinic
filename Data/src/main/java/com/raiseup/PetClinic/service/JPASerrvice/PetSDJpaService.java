package com.raiseup.PetClinic.service.JPASerrvice;

import com.raiseup.PetClinic.model.Pet;
import com.raiseup.PetClinic.repository.PetReporitory;
import com.raiseup.PetClinic.service.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {
    private final PetReporitory petReporitory;

    public PetSDJpaService(PetReporitory petReporitory) {
        this.petReporitory = petReporitory;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet>pets= new HashSet<>();
        petReporitory.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petReporitory.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petReporitory.save(object);
    }

    @Override
    public void delete(Pet object) {
        petReporitory.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petReporitory.deleteById(aLong);
    }
}

package com.raiseup.PetClinic.repository;

import com.raiseup.PetClinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
    Optional<Owner>findByLastName(String lastName);
}

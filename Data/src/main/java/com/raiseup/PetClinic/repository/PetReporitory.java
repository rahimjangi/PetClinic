package com.raiseup.PetClinic.repository;

import com.raiseup.PetClinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetReporitory extends CrudRepository<Pet,Long> {
}

package com.raiseup.PetClinic.repository;

import com.raiseup.PetClinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}

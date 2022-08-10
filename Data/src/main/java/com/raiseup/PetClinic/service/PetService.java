package com.raiseup.PetClinic.service;

import com.raiseup.PetClinic.model.Pet;
import org.springframework.stereotype.Service;

@Service
public interface PetService extends CrudService<Pet,Long> {

}

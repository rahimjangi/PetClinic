package com.raiseup.PetClinic.service;


import com.raiseup.PetClinic.model.Owner;
import org.springframework.stereotype.Service;

@Service
public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);
}

package com.raiseup.PetClinic.service;


import com.raiseup.PetClinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);
}

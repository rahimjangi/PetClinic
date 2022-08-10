package com.raiseup.PetClinic.model;

import jakarta.validation.constraints.NotEmpty;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person  extends BaseEntity{

    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

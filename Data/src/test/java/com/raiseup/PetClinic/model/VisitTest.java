package com.raiseup.PetClinic.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class VisitTest {
    Visit visit;
    Pet pet;
    @BeforeEach
    void setUp() {
        visit= new Visit();
        pet= new Pet();
    }
    @Test
    void getId(){
        visit.setId(1L);
        assertEquals(1L,visit.getId());
    }

    @Test
    void getDate() {
        visit.setDate(LocalDate.of(1982,9,23));
        assertEquals(LocalDate.of(1982,9,23),visit.getDate());
    }

    @Test
    void setDate() {
        visit.setDate(LocalDate.of(1982,9,23));
        assertEquals(LocalDate.of(1982,9,23),visit.getDate());
    }

    @Test
    void getDescription() {
        visit.setDescription("I am just a description!");
        assertEquals("I am just a description!",visit.getDescription());
    }

    @Test
    void setDescription() {
        visit.setDescription("I am just a description!");
        assertEquals("I am just a description!",visit.getDescription());
    }

    @Test
    void getPet() {
        pet.setName("rahim");
        visit.setPet(pet);
        assertEquals("rahim",visit.getPet().getName());
    }

    @Test
    void setPet() {
        pet.setName("rahim");
        visit.setPet(pet);
        assertEquals("rahim",visit.getPet().getName());
    }
}
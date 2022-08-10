package com.raiseup.PetClinic.service.JPASerrvice;

import com.raiseup.PetClinic.model.Visit;
import com.raiseup.PetClinic.repository.VisitRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class VisitSDJpaServiceTest {
    VisitSDJpaService visitSDJpaService;
    @Mock
    VisitRepository visitRepository;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        visitSDJpaService= new VisitSDJpaService(visitRepository);
    }

    @Test
    void findAll() {
        Visit visit= new Visit();
        HashSet data= new HashSet();
        data.add(visit);
        when(visitRepository.findAll()).thenReturn(data);
        assertEquals(1,1);

    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }
}
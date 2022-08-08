package com.raiseup.PetClinic.bootstrap;

import com.raiseup.PetClinic.model.*;
import com.raiseup.PetClinic.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final PetService petService;
    private final SpecialtiesService specialtiesService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, PetService petService, SpecialtiesService specialtiesService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.petService = petService;
        this.specialtiesService = specialtiesService;
    }


    @Override
    public void run(String... args) throws Exception {
        int count= petService.findAll().size();
        if(count==0){

            loadData();
        }

    }

    private void loadData() {
        Speciality radiology= new Speciality();
        radiology.setDescription("radiology");
        Speciality savedRadiology= specialtiesService.save(radiology);

        Speciality surgery= new Speciality();
        surgery.setDescription("surgery");
        Speciality savedSurgery= specialtiesService.save(surgery);

        Speciality dentistry= new Speciality();
        dentistry.setDescription("dentistry");
        Speciality savedDentistry= specialtiesService.save(dentistry);


        PetType dog= new PetType();
        dog.setName("Dog");
        PetType savedDogPetType= petTypeService.save(dog);

        PetType cat= new PetType();
        dog.setName("Cat");
        PetType savedCatPetType= petTypeService.save(cat);

        Pet dogy= new Pet();
        dogy.setPetType(savedDogPetType);
        dogy.setBirthDate(LocalDate.of(2019,2,2));
        dogy.setName("DOGY");
        petService.save(dogy);
        Pet savedDogy=petService.save(dogy);

        Pet caty= new Pet();
        caty.setPetType(savedCatPetType);
        caty.setBirthDate(LocalDate.of(2021,2,2));
        caty.setName("CATY");
        Pet savedCaty=petService.save(caty);

        Owner owner1= new Owner();
        owner1.setFirstName("rahim");
        owner1.setLastName("jangi");
        owner1.setAddress("Via valleranello 99");
        owner1.setCity("rome");
        owner1.setTelephone("43263526");
        owner1.getPets().add(savedCaty);
        ownerService.save(owner1);

        Owner owner2= new Owner();
        owner2.setFirstName("ramin");
        owner2.setLastName("jangi");
        owner2.setAddress("Via valleranello 99");
        owner2.setCity("tabriz");
        owner2.setTelephone("43263526");
        owner2.getPets().add(savedCaty);
        ownerService.save(owner2);

        Owner owner3= new Owner();
        owner3.setFirstName("hassan");
        owner3.setLastName("jangi");
        owner3.setAddress("Via valleranello 99");
        owner3.setCity("tabriz");
        owner3.setTelephone("43263526");
        owner3.getPets().add(savedDogy);
        ownerService.save(owner3);

        Owner owner4= new Owner();
        owner4.setFirstName("akbar");
        owner4.setLastName("jangi");
        owner4.setAddress("Via valleranello 99");
        owner4.setCity("rome");
        owner4.setTelephone("43263526");
        owner4.getPets().add(savedDogy);
        ownerService.save(owner4);

        Vet vet1= new Vet();
        vet1.setFirstName("hoshang");
        vet1.setLastName("kheairi");
        vet1.getSpecialities().add(savedDentistry);
        vetService.save(vet1);

        Vet vet2= new Vet();
        vet2.setFirstName("Leila");
        vet2.setLastName("kheairi");
        vet2.getSpecialities().add(savedRadiology);
        vetService.save(vet2);


        System.out.println("Vet Count "+vetService.findAll().size());
        System.out.println("Owner Count "+ownerService.findAll().size());
        System.out.println("Pet Count "+petService.findAll().size());
    }
}

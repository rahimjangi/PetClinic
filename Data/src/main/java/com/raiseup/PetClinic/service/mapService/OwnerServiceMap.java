package com.raiseup.PetClinic.service.mapService;

import com.raiseup.PetClinic.model.Owner;
import com.raiseup.PetClinic.model.Pet;
import com.raiseup.PetClinic.service.OwnerService;
import com.raiseup.PetClinic.service.PetService;
import com.raiseup.PetClinic.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Profile({"default","map"})
@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {
    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap( PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(Owner owner) {
        if(owner!=null){
            if(owner.getPets()!=null){
                owner.getPets().forEach(pet -> {
                    if(pet.getPetType()!=null){
                        if(pet.getPetType().getId()==null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    }else{
                        throw new RuntimeException("Pet type is required!");
                    }
                    if(pet.getId()==null){
                        Pet savedPet= petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(owner);
        }else{
            return null;
        }
    }

    @Override
    public Owner findById(Long id) {
        return this.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
